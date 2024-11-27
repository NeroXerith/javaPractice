package javaPractice;

import java.util.HashSet;
import java.util.Set;

public class Occurance {

	public static String get(String str) {
		if(str == null || str.isEmpty()) {
			return "None";
		}
		Set<Character> seen = new HashSet<>();
		for(char c : str.toCharArray()) {
			if(seen.contains(c)) {
				return String.valueOf(c);
			}
			seen.add(c);
		}
		return "None";
	}

}
