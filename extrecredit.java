

public class extrecredit {
	
	public static String str = "salvador";
	public static void main(String[] args) {
		//reverseString("Salvador"); //passing new objects of string. so the string changes length when passed.
		reverseString(str, str.length());//passing the same object each time. so str.length NEVER changes length.
		
	}
	
	
	/*
	public static void reverseString (String value) {//diff string objects changing value.length
		if(value.length()==1) {
				System.out.println(value);
		}
		else {
			System.out.print(value.charAt(value.length()-1));
			reverseString(value.substring(0, value.length()-1));
		}
	}
	*/
	
	public static void reverseString(String value){//HELPER METHOD FOR REVERSE STRING
		reverseString(value, value.length());
	}
			
	public static void reverseString (String value, int end) {//same object (string) that does the change value.length. end represents value.length
		if(end==1) { //if end=1
				System.out.println(value.charAt(end-1));
		}
		else {
			System.out.print(value.charAt(end-1));
			reverseString(value, end-1);
		}
	}
	
	public static int geoSum(int n) {
		if (n == 0) 
		      return 1;
		    else
		      return n * geoSum(n - 1); 
	}
}
