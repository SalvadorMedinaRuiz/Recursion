
public class ComputeFactorialTailRecursion {
  /** Return the factorial for a specified number */
  public static long factorial(int n) {
    return factorial(n, 1); // Call auxiliary method
  }
    
  /** Auxiliary tail-recursive method for factorial */
  private static long factorial(int n, int result) { //if when we start, n=3 and result = 1
    if (n == 0) 
      return result;
    else if(n==1)
    	return result;
    else
      return factorial(n - 1, n * result); // Recursive call, then (3-1, 3*1) = (2,3)
  }
}
