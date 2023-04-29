/*
Name: Joshua Lobo
PRN: 21070126127
Batch: AIML B3

OS: Mac OS 12.2.1 Monterey
java Version: 19.0.1 2022-10-18
Java(TM) SE Runtime Environment (build 19.0.1+10-21)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.1+10-21, mixed mode, sharing)
*/

// Importing the Scanner class to take input from the user
import java.util.Scanner;

// Main class NoMatch
public class NoMatch {
    // Main method
    public static void main(String[] args) {
    // Creating a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompting the user to enter a string
            System.out.print("Enter a string: ");
            // Reading the input string entered by the user
            String inputString = scanner.nextLine();
            // Checking if the input string matches "India"
            if (!inputString.equals("India")) {
                // Throwing the user-defined exception NOMATCHEXCP if the input string does not match "India"
                // The exception message generated shows the line number and the erroneous String that was inputted by the user.
                throw new NOMATCHEXCP(inputString, Thread.currentThread().getStackTrace()[1].getLineNumber());
            }
            // Printing the message if the input string matches "India"
            System.out.println("Input string matches \"India\"");
        } catch (NOMATCHEXCP e) {
            // Handling the user-defined exception NOMATCHEXCP
            System.out.println(e);
        }
    }

}

