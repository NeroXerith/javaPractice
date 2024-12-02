package javaPractice;

public class TimeConvertion {

	public static String Convert(String s) {
		String hh = s.substring(0, 2);
//		String mm = s.substring(3, 5);
//		String ss = s.substring(6, 8);
//		String newDate = "";
//		
//		if(s.contains("PM") && hh.equals("12")) {
//			return s.substring(0, 8);
//		} else if(s.contains("AM") && hh.equals("12")) {
//			newDate = "00" + ":" + mm + ":" + ss;
//		} else if(s.contains("AM") && !hh.equals("12")) {
//			newDate = hh + ":" + mm + ":" + ss;
//		}else {
//			newDate = (Integer.parseInt(hh) + 12) + ":" + mm + ":" + ss;
//		}
//		return newDate;
		
		 if(s.contains("PM")) {
		        if(!hh.equals("12")) {
		            hh = ""+(Integer.parseInt(hh) + 12);
		        }
		 } else {
		        if(hh.equals("12")) {
		            hh = "0";
		        }
		    }
		 
		return String.format("%02d%s",Integer.parseInt(hh), s.substring(2,8));
	}

}
