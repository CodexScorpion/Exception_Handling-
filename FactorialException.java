/**
 This class defines a custom exception for handling invalid inputs for calculating factorial.
 It extends the built-in Exception class.
 */
public class FactorialException extends Exception {
    private int num;

    /**
     Constructor for creating a new instance of the FactorialException class with the invalid input number as parameter.
     @param num The invalid input number that caused the exception to be thrown.
     */
    public FactorialException(int num) {
        this.num = num;
    }
    /**
     Overrides the toString() method of the Exception class to provide a custom error message.
     @return A string representation of the custom error message with the invalid input number.
     */
    public String toString() {
        return "FactorialException: Invalid input number " + num + " (should be between 0 and 16)";
    }
}