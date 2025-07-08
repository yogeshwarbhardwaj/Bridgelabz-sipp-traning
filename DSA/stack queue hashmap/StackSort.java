import java.util.Stack;

public class StackSort {
    
    // Function to insert an element into a sorted stack at the correct position
    public static void sortedInsert(Stack<Integer> stack, int element) {
        // If stack is empty or the top element is less than or equal to the element,
        // push the element
        if (stack.isEmpty() || element >= stack.peek()) {
            stack.push(element);
            return;
        }
        // Otherwise, pop the top, recurse, and then push the top again
        int temp = stack.pop();
        sortedInsert(stack, element);
        stack.push(temp);
    }

    // Function to sort the stack using recursion
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Pop the top element
            int top = stack.pop();
            // Recursively sort the remaining stack
            sortStack(stack);
            // Insert the popped element into the sorted stack
            sortedInsert(stack, top);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // Add unsorted elements
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);

        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}