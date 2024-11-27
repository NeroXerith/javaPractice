package javaPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurance_Oracle {

	public static List <List<String>> occurance(List<Integer> arr) {
		// Collection is {2,2,4,1,2}
		// return must be in 2D Array, get the element has a lot of duplicates and the least duplicates
		// e.g. output 2 3
		//			   1 1        since 2 = 3 and 1 = 1

		Map <Integer, Integer> ctrDuplicates = new HashMap();
		for(Integer n : arr) {
			ctrDuplicates.put(n, ctrDuplicates.getOrDefault(n, 0) + 1);
		}
		
		int maxDup = Collections.max(ctrDuplicates.values());
		int minDup = Collections.min(ctrDuplicates.values());


		List <String> mostOccured = new ArrayList<>();
		List <String> leastOccured = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> entry : ctrDuplicates.entrySet()) {
			if(entry.getValue() == maxDup) {
				mostOccured.add(entry.getKey() + " " + entry.getValue());
			}
			
			if(entry.getValue() == minDup) {
				leastOccured.add(entry.getKey() + " " + entry.getValue());
			}
		}
		
		List <List<String>> result = new ArrayList<>();
		result.add(mostOccured);
		result.add(leastOccured);
		
		return result;
	}

}
