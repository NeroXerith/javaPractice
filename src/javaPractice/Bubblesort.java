package javaPractice;

import java.util.List;

public class Bubblesort {

	public static void Sort(List<Integer> arr) {
		for(int i = 0; i < arr.size(); i++) {
			boolean isSwaped = false;
			for(int j = 0; j < arr.size() - i -1; j++) {
				int tmpHandler = arr.get(j);
				if(arr.get(j) > arr.get(j+1)) {
					arr.set(j, arr.get(j+1));
					arr.set(j+1, tmpHandler);
					isSwaped = true;
				}
			}
			if(!isSwaped) break;
		}
		System.out.println(arr.toString());
	}

}
