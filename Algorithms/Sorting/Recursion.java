// https://github.com/JeninSutradhar/JAVA-DataStructures-Algorithms

// Recursion :  - When a thing is Defined in terms of itself.
//              - Applies the result of a procedure to procedure.
//              - A recursive Method calls itself     
//              - Can be a Substitue of Iteration 
//              - Commonly Used with advance Sorting Algorithms and Navigation trees

public class Recursion {
    public static void main(String[] args) {
        
        // Set the number for which we want to find the factorial
        int number = 5; 
        
        // Call the factorial method and store the result
        int result = factorial(number);
        
        // Print the result
        System.out.println("Factorial of " + number + " is: " + result);
    }

    // Recursive method to calculate the factorial of a number
    private static int factorial(int n) {
        
        // Base case: If n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive case: Multiply n with factorial of (n-1)
            return n * factorial(n - 1);
            // This step calls the factorial method again with a smaller number
        }
    }
}
/*
 * we're calculating the factorial of a number using recursion. 
 * The factorial method calls itself with a smaller number until 
 * it reaches the base case (where n is 0 or 1). Then, it starts 
 * returning values back up the call stack, multiplying each returned value by n, 
 * until it reaches the original call and computes the final result
 */