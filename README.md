# Java-Class-Based-Calculator
Overview: You will create a four-function calculator in java using classes, interfaces, and enums. Doing this will teach you the important features of java that we use in Robotics code

Requirements:
Calculator.java -> This should be an interface that specifies what specific methods each calculator needs (add, subtract, multiply, divide, format)

StandardCalculator.java -> This class should implement the calculator interface and implement all 5 methods (description of the 5 methods are below)

ScientificCalculator.java -> This class should inherit from StandardCalculator, except the format option should return a number in scientific notation instead of numerical notation

Main.java -> Define an Enum to keep track of what mode the calculator is in rather than using 4 booleans or 4 numbers. Use a try-catch statement to catch bad user input. Write a main loop that repeats and has an option to terminate. In the main loop, we should be able to choose which calculator we want.

Methods 
add(double x, double y) -> should add the two numbers

subtract(double x, double y) -> should subtract the two numbers

multiply(double x, double y) -> should multiply the two numbers

divide(double x, double y) -> should divide the two numbers

format(double x) -> should format a the number, for the "standard" calculator it should round the number to the nearest 3 decimal places. For the "scientific" calculator it should format the number into scientific notation to the nearest 3 decimal places.

Submission:
Submit the 4 files: Calculator.java, StandardCalculator.java, ScientificCalculator.java, Main.java

Example input:

What mode do you want (N)ormal or (S)cientific:
S
Operation? (A)ddition, (S)ubtraction, (M)ultiplication, or (D)ivision:
M
First number?
22.9
Second Number?
92039093
Answer: 2.108 * 10^9, Again? (Y)es or (N)o
N
