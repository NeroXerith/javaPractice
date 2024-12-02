package javaPractice;

import java.util.List;

public class DiagonalDifference {

	public static int solve(List<List <Integer>> arr) {
		// 1 2 3
		// 4 5 6
		// 9 8 9
		// Primary Dia    Secondary Dia
		// Math.abs((1 + 5 + 9) - (3 + 5 + 9));
		
		int pdiagonal = 0;
		int sdiagonal = 0;
		
		for(int i = 0; i < arr.size(); i++) {
			pdiagonal += arr.get(i).get(i);
			sdiagonal += arr.get(i).get(arr.size() - i - 1);
		}
		
		return Math.abs(pdiagonal - sdiagonal);
	}

}
