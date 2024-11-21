package javaPractice;

public class Sew {

	public Sew(String s1, String s2) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < s1.length(); i++) {
			char l = s1.charAt(i);
			char l2 =  s2.charAt(i);
			result.append(l);
			result.append(l2);
		}
		System.out.println(result.toString());
	}

}
