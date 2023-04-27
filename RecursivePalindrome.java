
public class RecursivePalindrome {
  public static boolean isPalindrome(String s) {
    return isPalindrome(s, 0, s.length() - 1);
  }

  public static boolean isPalindrome(String s, int low, int high) {
    if (high <= low) // Base case. so if low 0 and high is 3, then skips this. if low if 2 and high is 1, then return true.
      return true;
    else if (s.charAt(low) != s.charAt(high)) // Base case. if both characters are not the same, then returns false. if they are, then the method keeps going
      return false;
    else
      return isPalindrome(s, low + 1, high - 1);//comparing m to n in moon, then o to o
  }

  public static void main(String[] args) {
    System.out.println("Is moon a palindrome? " 
      + isPalindrome("moon"));
    System.out.println("Is noon a palindrome? " 
      + isPalindrome("noon"));
    System.out.println("Is a a palindrome? " + isPalindrome("a"));
    System.out.println("Is aba a palindrome? " + 
      isPalindrome("aba"));
    System.out.println("Is ab a palindrome? " + isPalindrome("ab"));
  }
}
