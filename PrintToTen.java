/*
Object oriented programming Lab 2 question 1

Complete the main method in the PrintToTen class by
1.	Declaring the interger-typed variable number = 0 
2.	Using a while loop to assign the values of number from 1 to 10
3.	Print the formatted output of number for each iteration of the while loop

For example:
Test	Result
PrintToTen.main(new String[]{});	number = 1
number = 2
number = 3
number = 4
number = 5
number = 6
number = 7
number = 8
number = 9
number = 10



import java.util.Scanner; 

public class PrintToTen 
{

}
*/





import java.util.Scanner; // Correct import statement

public class PrintToTen {
    public static void main(String[] args) {
        int number = 1; // Initial number = 1
        while (number <= 10) { // Loop until number is less than or equal to 10
            System.out.println("number = " + number); // Print number
            number++; // Increase by 1
        }
    }
}
