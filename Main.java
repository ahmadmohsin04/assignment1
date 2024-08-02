
// Question 1

// Ramesh’s basic salary is 10,5000. His dearness allowance is 40% of basic salary, and house rent allowance is 20%
// of basic salary. Write a program to calculate his gross salary?
// public class Main {
//     public static void main(String[] args) throws Exception {
//         double salary = 105000;
//         double dearnessAllowance = salary * 0.4;
//         double houseRentAllowance = salary * 0.2;
//         double grossSalary = salary + dearnessAllowance + houseRentAllowance;
//         System.out.println("The gross salary is : RS." + grossSalary);
//     }
// }


// Question 2

// The distance between two cities (in km.) is 2614. Write a program to convert and print this distance in
// meters, feet, inches and centimeters?

// public class Main {
//     public static void main(String[] args) {
//         double distance = 2614;
//         double distanceMeters = distance * 1000;
//         double distanceFeet = distance * 3280.84;
//         double distanceCentimeters = distance * 100000;
//         System.out.println("The distance in kilometers is : " + distance + " km");
//         System.out.println("The distance in meters is : " + distanceMeters + " m");
//         System.out.println("The distance in feet is : " + distanceFeet + " ft");
//         System.out.println("The distance in centimeters is : " + distanceCentimeters + " cm");
//     }
// }


// Question 3 

// If the marks obtained by a student in five different subjects are 80,90,75,60,100, find out the aggregate
// marks and percentage marks obtained by the student. Assume that the maximum marks that can be
// obtained by a student in each subject is 100?

// public class Main {
//     public static void main(String[] args) {
        
//         int [] marks = {80,90,75,60,100};
//         int marksPerSubject = 100;
//         int numberOfSubjects = 6;

//         int aggregateMarks = 0;
//         for (int mark : marks){
//             aggregateMarks += mark;
//         }

//         int totalMarks = marksPerSubject * numberOfSubjects;
//         double percentage = ((double) aggregateMarks / totalMarks) * 100;

//         System.out.println("The aggregate marks are : " + aggregateMarks);
//         System.out.println("The percentage is : " + percentage + "%");
//     }
// }


// Question 4

// Temperature of a city in Fahrenheit degrees is 108F. Write a program to convert this temperature into
// Centigrade degrees

// public class Main { 
//     public static void main(String[] args) {
        
//         int temperature = 108;
//         double centigrade = (temperature - 32) * 5/9;
//         System.out.println("The temperate in Farhenheit : " + temperature + "F");
//         System.out.println("The temperature in Celsius : " + centigrade + "C");
//     }
// }

// Question 5

// The length & breadth of a rectangle and radius of a circle are 36. Write a program to calculate the area
// & perimeter of the rectangle, and the area & circumference of the circle?


// public class Main {
//     public static void main(String[] args) {
//         int lR =36;
//         int bR = 36;
//         int rC = 36;

//         int aR = lR * bR;
//         int pR = 2 * (lR + bR);
//         double aC = 3.14 * rC * rC;
//         double cC = 2 * 3.14 * rC;

//         System.out.println("Area of Rectange : " + aR);
//         System.out.println("Perimeter of Rectange : " + pR);
//         System.out.println("Area of Circle : " + aC);
//         System.out.println("Circumference of Circle : " + cC);
//     }
// }

// Question 6

// Take two positive number 8 and 12 from user. Calculate and display an
// . Assume that the power operator
// or built-in function is available?


// import java.util.*;
// public class Main {

//     public static void main(String[] args) {
        
//         Scanner scanner = new Scanner(System.in);

//         System.out.println("Enter a number : ");
//         int base = scanner.nextInt();

//         System.out.println("Enter it's power : ");
//         int power = scanner.nextInt();
//          long result = 1;
//         for(int i = power ; i > 0 ; i--){
//             result *= base; 
//         }
//         System.out.println("Result : " + result);
//     }
// }

// Question 7

// If a five-digit number is 12345, write a program to calculate the sum of its digits? (Hint: Use the modulus operator ‘%’)?

// public class SumOfDigits {
//     public static void main(String[] args) {
//         int number = 12345;
//         int sum = 0;

//         while (number != 0) {
//             int digit = number % 10;
//             sum += digit;
//             number = number / 10;
//         }

//         System.out.println("Sum of digits: " + sum);
//     }
// }



// Question 8

// In a town, the percentage of men is 52. The percentage of total literacy is 48. If total percentage of
// literate men is 35 of the total population, write a program to find the total number of illiterate men
// and women if the population of the town is 80,000?

// public class Main {
//     public static void main(String[] args) {
        
//         int population = 80000;
//         float totalMen = 80000 * 0.52f;
//         float totalWomen = 80000 * 0.48f;
//         float literateMen = 80000 * 0.35f;
//         float literalWomen = 80000 * 0.18f;
//         float illiterateMen = totalMen - literateMen;
//         float illiterateWomen = totalWomen - literalWomen;

//         System.out.println("Number of illeterate men : " + illiterateMen);
//         System.out.println("Number of illeterae women : " + illiterateWomen);
        

//     }
// }


// Question # 9

// A cashier has currency notes of denominations 10, 50 and 100. If the amount to be withdrawn is input through the keyboard in hundreds, find the total number of currency notes of each denomination the cashier will have to give to the withdrawer?

// import java.util.Scanner;

// public class CurrencyNotesCalculator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter the amount to be withdrawn (in hundreds): ");
//         int amount = scanner.nextInt() * 100;

//         int hundreds = amount / 100;
//         amount %= 100;

//         int fifties = amount / 50;
//         amount %= 50;

//         int tens = amount / 10;
//         amount %= 10;

//         System.out.println("Number of 100 denomination notes: " + hundreds);
//         System.out.println("Number of 50 denomination notes: " + fifties);
//         System.out.println("Number of 10 denomination notes: " + tens);

//         scanner.close();
//     }
// }


// Question 10 

// If the total selling price of 15 items and the total profit earned on them is 20%, write a program to find the cost price of one item? 

// import java.util.Scanner;

// public class CostPriceCalculator {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Input the total selling price of 15 items
//         System.out.print("Enter the total selling price of 15 items: ");
//         double totalSellingPrice = scanner.nextDouble();

//         // Calculate the total cost price of 15 items using the profit formula
//         double totalProfitPercentage = 20.0;
//         double totalCostPrice = totalSellingPrice / (1 + totalProfitPercentage / 100);

//         // Calculate the cost price of one item
//         double costPricePerItem = totalCostPrice / 15;

//         // Print the cost price of one item
//         System.out.println("Cost price of one item: " + costPricePerItem);

//         scanner.close();
//     }
// }
