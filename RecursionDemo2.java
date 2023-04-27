// Recursion methods that return a value
public class RecursionDemo2 {

	public static void main(String[] args) {
	    System.out.println(power(2, 3));
		System.out.println(magnitude(123));
		astExpts(5);

	}
	
	public static int power (int base, int exp)//helper method
	{
		return power(base, exp, base);
		
	}
	
	public static int power (int base, int exp, int result)//tail recursion for power
	{
		if (exp == 0)
			return 1;
		else if (exp == 1)
		{
			return base;
		}
		else
			return power (base, exp-1, base*result); //2,3,2*2
	}
	
/* 
 *  
 */ public static int magnitude (int num)
	{
		//The method will calculate the magnitude of a non-negative integer  parameter.
		// Use no loops or local variables.
		if (num<10)
	    		return 0;
	    else return magnitude(num/10) + 1; 
	}
	

 /* A recursive method with a parameter that is a non-negative integer.
 * The method will write that number of asterisks to the screen followed by that number of 
 * exclamation points.  
 **/
 public static void astExpts (int count){
		if (count == 0) return;
		else {
			System.out.print("*");
			astExpts(count-1);
			System.out.print("!");
		}
		
	}
 

}
