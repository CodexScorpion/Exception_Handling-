# Exception Handling in Java

This repository contains Java code for two custom exceptions: FactorialException and NoMatchException.

Factorial Exception and NoMatchException are custom exception classes used in Java programming language for handling specific error scenarios. These exceptions provide more control and flexibility to the programmers for handling errors in their programs.



## FactorialException
*FactorialException* is a custom exception class that extends the Exception class. It is thrown by the *calculateFactorial* method in the *Factorial class* when the input integer is less than 0 or greater than 16. The *toString* method of the *FactorialException* class generates an error message indicating the invalid input number that caused the exception to be thrown.

The Factorial class also contains a main method that demonstrates how to handle FactorialException. It takes input integers from the command line arguments and calculates their factorial using the calculateFactorial method. If the input integer is invalid, a FactorialException is thrown and caught in the main method.

## NoMatchException
*NoMatchException* is a custom exception class that is thrown when the user enters a string that does not match the string "India". The *NoMatchException* class has a parameterized constructor that takes a line number and the erroneous string that was inputted by the user.

The demo program for *NoMatchException* uses a try-catch block to handle the exception. It prompts the user to enter a string and checks if it matches "India". If it doesn't match, a *NoMatchException* is thrown and caught in the catch block, which displays the error message generated by the *NoMatchException* class.

## Running the Code
To run the code, clone this repository and open the project in an IDE that supports Java. Compile and run the Factorial and NoMatchExceptionDemo classes to see how the custom exceptions are thrown and caught.
