package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import sortingAlgo.*;


public class Main {

	public static void main(String[] args) {
//		Vehicle car1 = new Vehicle("Honda");
//		
//		System.out.println(car1.getBrand());
		List <Integer> arr = new ArrayList<>(Arrays.asList(2,5,1,4,6,3,7,9,10,8));
//		Insertion first = new Insertion(arr);
//		System.out.println(Quicksort.Sort(arr));
//		Bubblesort.Sort(arr);
		
//		String s1 = "ACE";
//		String s2 = "BDF";
//		Sew first = new Sew(s1, s2);
		
		String str = "baaab";
//		ReducedString first = new ReducedString(str);
//		KReducedString first = new KReducedString(str, 4);
//		System.out.println(Occurance.get(str));
//		List <Integer> arr2 = new ArrayList<>(Arrays.asList(2,2,4,1,2));
//		System.out.println(Occurance_Oracle.occurance(arr2));
//		Accessing2D.Start();
//		System.out.println(arr.stream().filter(a -> a + a == 2).collect(Collectors.toList()));
		List <List <Integer>> twoDArr = new ArrayList<>(Arrays.asList(Arrays.asList(11,2,4), Arrays.asList(4,5,6), Arrays.asList(10, 8, -12)));
//		twoDArr.add(new ArrayList<>() {{
//			add(11);
//			add(2);
//			add(4);
//		}});
//		System.out.println(twoDArr);
//		System.out.println(DiagonalDifference.solve(twoDArr));
		
		System.out.println(TimeConvertion.Convert("06:45:54AM"));
		
	}

}
