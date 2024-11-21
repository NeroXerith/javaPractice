package javaPractice;

import java.util.Stack;

public class ReducedString {

	public ReducedString(String str) {
		Stack <Character> arr = new Stack<>();
		for(char l : str.toCharArray()) {
			if(!arr.isEmpty() && arr.peek()==l) {
				arr.pop();
			} else {
				arr.push(l);
			}
		}
		System.out.println(arr.toString());
	}

}
