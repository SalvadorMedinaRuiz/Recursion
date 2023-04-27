// Tail Recursive methods 

public class RecursiveDemo3 {

	public static void main(String[] args) {
		System.out.println(power(2,3));
		//System.out.println(magnitude(123));
		//System.out.println(factorial (3));
	}

	public static int factorial (int n) {
		return factorial (n, 1); 
	}

	public static int factorial (int n, int result) {

		//base cases
		if (n==0)
			return result;
		else if (n==1)
			return result;
		else 
			return factorial(n-1, n*result);

	}

	public static int power (int base, int exp) {
		if (exp == 0)
			return 1;
		else
			return power(base, exp, base);
	}
	
	public static int power (int base, int exp, int result)
	{
		if (exp == 1)
			return result;
		else
			return power (base, exp-1, base * result);
	}


	public static int magnitude (int num)
	{
		//The method will calculate the magnitude of a non-negative integer  parameter.
		// Use no loops or local variables.
		if (num<10)
			return 0;
		else return magnitude(num/10) + 1; 

	}


}
