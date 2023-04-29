/**
 A user-defined exception class that is thrown when the input string is not equal to "India".
 It has a parameterized constructor to store the input string and the line number where the exception occurred.
 */

public class NOMATCHEXCP extends Exception {
    private String inputString;
    private int lineNumber;


    /**
     Constructs a NOMATCHEXCP object with the input string and the line number where the exception occurred.
     @param inputString the input string that caused the exception
     @param lineNumber the line number where the exception occurred
     */
    public NOMATCHEXCP(String inputString, int lineNumber) {
        this.inputString = inputString;
        this.lineNumber = lineNumber;
    }
    /**
     Returns the exception message that includes the input string and the line number where the exception occurred.
     @return the exception message
     */

    public String toString() {
        return "NOMATCHEXCP: Input string \"" + inputString + "\" at line " + lineNumber + " does not match \"India\"";
    }
}



