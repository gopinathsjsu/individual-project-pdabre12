# CMPE 202 Individual Project
Name: Pratik Joseph Dabre

SJSU ID: 015961439
## Instructions to run the project
- Go to repo pdabre12 and clone the repository or download the zip file.
- You need Intellij IDE to run the code.
- Open the zipped folder or the entire folder in Intellij using Open Project.
- After opening the project go to Market.java which is inside src->Market.java and inside that go to class and type in the absolute path of the Dataset and Card Csv files.
(Screenshots are attached below to help you pinpoint that part of the code)
- Build and run the code next and you will get a "Enter your input file" prompt in the terminal in that enter absolute path of Test1.csv,Test2.csv,Test3.csv according to needs.
- Output is displayed in the terminal and the error file or output CSV file is generated and the path of either files is also displayed in the terminal.


## Design Patterns :
 
### Singleton pattern
We have Item manager as a singleton pattern.
As Item Manager controls the stock we want to have only one instance of that in the program, so that no concurrent changes take place to the stock database.

### Factory pattern:
Factory pattern is used because the output file decides whether the output is going to be an error txt file or an Output CSV file containing final amount



## Class Diagram:
![Screenshot (90)](https://user-images.githubusercontent.com/80276547/144790435-f40be982-9316-488d-a53a-f488fc6f65c5.png)
