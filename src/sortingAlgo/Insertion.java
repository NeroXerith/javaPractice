package sortingAlgo;

import java.util.List;
import java.util.stream.Collectors;

public class Insertion {

	public Insertion(List <Integer> arr) {

		for(int i = 1; i < arr.size(); i++) {
			int key = arr.get(i);
			int prev = i - 1;
			while(prev >= 0 && arr.get(prev) > key) {
				arr.set(prev + 1, arr.get(prev));
				prev = prev - 1;
			}
			arr.set(prev + 1, key);
		}
		String result = arr.toString(); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		String results = arr.stream().map(Object::toString).collect(Collectors.joining(" "));
		System.out.println(results);
	}

}
