// jeninsutradhar@gmail.com
// created: 09 April 2024

// Stack Memory Allocation  
// Rule = LIFO (Last in First Out)
// Stores objects into a sort of "Vertical Tower"
// Features = Access, Modify..... 

import java.util.Arrays;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        // Removing the last object(By Default) using pop() ADT
        stack.pop();

        // Search An Element
        System.out.println(stack.search("Doom"));

        // Peeking: Retrieve the top element of the stack without removing it.
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        System.out.println(stack);

        // Iterating Over Stack: Iterate over the elements in the stack
        for (String element : stack) {
            System.out.println(element);
        }

        // Copying Stack: Create a copy of the stack.
        Stack<String> copyStack = (Stack<String>) stack.clone();
        System.out.println("Copy of stack: " + copyStack);

        // Converting Stack to Array: Convert the stack into an array using toArray() ADT
        Object[] stackArray = stack.toArray();
        System.out.println("Stack converted to array: " + Arrays.toString(stackArray));
    
        // Uses Of Stacks
        /*
         * undo/redo features in text Editors
         * moving back&forward through browser history
         * backtracking Algorithms (maxe, file Directories)
         * Calling Functions (call stack)
         */
    }
}
