package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Accessing2D {

	public static void Start() {
		List<List<Integer>> arr = new ArrayList<>();
//		Stack <Integer> stack = new Stack<>();
//		System.out.println("List Size : " + arr.size());
//		System.out.println("Stack Capacity : " + stack.capacity());
//		System.out.println("Stack Size : " + stack.size());
//		
//		stack.push(1);
//		stack.push(3);
//		stack.push(1);
//
//		System.out.println("Stack Capacity : " + stack.capacity());
//		System.out.println("Stack Size : " + stack.size());
		
		/*
		 * 2 Ways to add an element in a 2D array 
		 * 1st approach implicit approach
		 */		
		arr.add(new ArrayList<>()); 
		arr.get(0).add(2);
		arr.get(0).add(4);
		System.out.println("Implicit 1 = "+ arr);
		
		arr.add(new ArrayList<>() {
			{
				add(10);
				add(5);
				add(6);
			}
		});
		
		System.out.println("Implicit 2 = "+arr);
		
		
		//2nd approach Explicit by creating or instantiate new List array
		List<Integer> explicit = new ArrayList<>(Arrays.asList(2,3,4));
		arr.add(explicit);
		System.out.println("Explicit = "+ arr);
		
		// Accessing an element in 2D
		System.out.println("Accessing = "+ arr.get(2).get(1));
		
		// Updating an element in 2D
		// row 2 , column 1 or index 1, newValue
		arr.get(2).set(1, 2);
		System.out.println("Updated = " + arr);
		
	
		
	}

}
