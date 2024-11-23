package javaPractice;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {

	public static List <Integer> Sort(List <Integer> arr) {
		if( arr.size() <= 1) {
			return arr;
		}
		int middle = arr.size()/2;
		int pivot = arr.get(middle);
		
		List <Integer> leftSide = new ArrayList<>();
		List <Integer> rightSide = new ArrayList<>();
		
		for(int i = 0; i < arr.size(); i++) {
			if(i == middle) continue;
			
			if(pivot > arr.get(i)) {
				leftSide.add(arr.get(i));
			} else {
				rightSide.add(arr.get(i));
			}
		}
		
		List <Integer> sortLeft = Sort(leftSide);
		List <Integer> sortRight = Sort(rightSide);
		
		List <Integer> sorted = new ArrayList<>(sortLeft);
		sorted.add(pivot);
		sorted.addAll(sortRight);
		
		return sorted;
	}

}
