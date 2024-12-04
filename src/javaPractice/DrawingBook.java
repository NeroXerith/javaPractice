package javaPractice;

public class DrawingBook {

	public static int getCount(int n, int p) {
		/*
		 * Parameter n is the number of pages
		 * Parameter p is the page number to turn to
		 */
		int fromBegin = p/2;
		int fromEnd = (n/2) - (p - 2);
		
		return fromBegin < fromEnd ? fromBegin : fromEnd;
	}

}
