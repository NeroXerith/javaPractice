package javaPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class KReducedString {

	public KReducedString(String word, int k) {
		Stack<Character> stack = new Stack<>();
		int ctr = 1;

		for (char current : word.toCharArray()) {
		    if (!stack.isEmpty() && stack.peek() == current) {
		        ctr++; // Increment counter for consecutive characters
		        if (ctr == k) {
		            for (int i = 1; i < k; i++) {
		                stack.pop(); // Remove k-1 characters
		            }
		            ctr = 1; // Reset counter since the group is removed
		        } else {
		            stack.push(current); // Push current character
		        }
		    } else {
		        stack.push(current); // Push new character
		    }
		}
		
	System.out.println(stack.toString());
    }

}


