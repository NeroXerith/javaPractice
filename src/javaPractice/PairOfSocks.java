package javaPractice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairOfSocks {

	public static int getPair(int n, List <Integer> ar) {
		// There is a large pile of socks that must be paired by color. Given an array of integers representing 
		// the color of each sock, determine how many pairs of socks with matching colors there are.
		// n = 7 and ar = [1,2,1,2,1,3,2]
		Map <Integer, Integer> socks = new HashMap<>();
		for(Integer i : ar) {
			socks.put(i, socks.getOrDefault(i, 0) + 1);
		}
		
		int pairCtr = 0;
		for(Map.Entry<Integer, Integer> entry : socks.entrySet()) {
			if(entry.getValue() % 2 != 0) {
				entry.setValue(entry.getValue() - 1);
			}
			pairCtr += entry.getValue() / 2;
		}
		
		return pairCtr;
	}

}
