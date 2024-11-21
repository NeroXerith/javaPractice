package javaPractice;

import java.util.Stack;
import java.util.stream.Collectors;

public class KReducedString {

	public KReducedString(String word, int k) {
		Stack<Character> stack = new Stack<>();
		int ctr = 0;

		for (char current : word.toCharArray()) {
		    if (!stack.isEmpty() && stack.peek() == current) {
		        ctr++; // Increment counter for consecutive characters
		        if (ctr == k) {
		            for (int i = 0; i < k - 1; i++) {
		                stack.pop(); // Remove k-1 characters
		            }
		            ctr = 0; // Reset counter since the group is removed
		        } else {
		            stack.push(current); // Push current character
		        }
		    } else {
		        stack.push(current); // Push new character
		        ctr = 1; // Reset counter for a new character group
		    }
		}

		// Build the final string from the stack
		StringBuilder result = new StringBuilder();
		while (!stack.isEmpty()) {
		    result.append(stack.pop());
		}

        System.out.println( result.reverse().toString());
    }

}


