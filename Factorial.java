//Java program to calculate the factorial of a number using a command line argument.

public class Factorial {
    public static void main(String[] args) {

        try {
            // Loop through all the command line arguments provided by the user
            for (int i = 0; i < args.length; i++) {
                // Parse the integer from the string argument
                int n = Integer.parseInt(args[i]);
                // Call the calculateFactorial method to calculate the factorial
                int factorial = calculateFactorial(n);
                // Print the result
                System.out.println("Factorial of " + n + " is: " + factorial);
            }
        } catch (NumberFormatException e) {
            // Handle the case when user provides invalid input
            System.out.println("Invalid input: " + e.getMessage());
        } catch (FactorialException e) {
            // Handle the case when input is out of range
            System.out.println(e);
        }
    }

    // Method to calculate factorial of a number
    public static int calculateFactorial(int n) throws FactorialException {
        // Check if the input is out of range
        if (n < 0 || n > 16) {
            throw new FactorialException(n);
        }
        // Calculate the factorial
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        // Return the factorial
        return factorial;
    }
}


