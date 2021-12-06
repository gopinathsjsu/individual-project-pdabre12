package com.example.market;



import java.util.List;
import java.util.Scanner;

/**
 * Simple Java program to read CSV file in Java. In this program we will read
 * list of books stored in CSV file as comma separated values.
 *
 * @author WINDOWS 8
 *
 */
public class Market {

    public static void main(String... args) {
        ItemCSVParser ItemParser = new ItemCSVParser();
        CreditCardCSVParser cardParser = new CreditCardCSVParser();
        List<Item> items = ItemParser.readItemsFromCSV("C:/Users/Checkout/Downloads/Dataset (2).csv");
        List<CreditCard> cards = cardParser.readCardsFromCSV("C:/Users/Checkout/Downloads/Cards.csv");

        // let's print all the person read from CSV file


        for (Item i : items) {
            System.out.println(i.toString());
        }
        for (CreditCard c : cards) {
            System.out.println(c.toString());
        }

        Scanner scanner = new Scanner(System.in);
        String file = scanner.nextLine();
        System.out.println(file);

        //Input file csv converted to database
        InputItemCSVParser input = new InputItemCSVParser();
        List<Item> orderItems = input.InputFileParser(file);


        CreditCardInputCSVParser card = new CreditCardInputCSVParser();
        List<CreditCard> orderCards = card.InputFileParser(file);



        // Set Category and price of items that are given as input
        ItemManager manager = new ItemManager();
        manager.manageItem(items,orderItems,orderCards);

        Validator v = new Validator();
        v.validateCart(items,orderItems,cards,orderCards);



//        System.out.println("Order Items:");
//        for (Item i : orderItems) {
//
//            System.out.println(i.toString());
//        }

        System.out.println("Items after database update");
        for (Item i : items) {
            System.out.println(i.toString());
        }

        System.out.println("Final Card list after update");
        for ( CreditCard c : cards){
            System.out.println(c.toString());
        }

    }





}



