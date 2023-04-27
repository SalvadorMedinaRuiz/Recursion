
public class RecursionDemo1 {

	public static void main(String[] args) {
		displayStars(5);
		verticalNumbers(1234);
	}
	
	public static void displayStars(int n)
	{
		if (n==1)
			System.out.print("*");
		else
		{
			System.out.print("*");
			displayStars(n-1);
		}
	}
	
	public static void verticalNumbers(int n)
	{
		if (n < 10)
			System.out.println(n);
		else
		{
			verticalNumbers(n/10);
			System.out.println(n%10);
		}
	}
	
}









