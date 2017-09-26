import javax.naming.LinkLoopException;

public class Palindrome {

	/**
	 * 
	 * This class using for verifying the given integer number whether is palindrome
	 * or not.
	 * 
	 * 
	 */

	public boolean isPalindromeByString(int num) {

		// parse the num type from int to String.
		String target = String.valueOf(num);
		// compare to the given number after reverse the string.
		return new StringBuffer(target).reverse().toString().equals(target);

	}

	public boolean isPalindromeByNumber(int num) {

		int targetNum = num, reverseNum = 0;
		// when given number less than is not palindrome.
		if (num < 0)
		  return false;
        //loop the given number and make is be reversed.	
		while(targetNum>0) {
			reverseNum = reverseNum*10 + targetNum%10;
			targetNum  = targetNum/10;
		}
		
		return reverseNum==num;

	}
	
	public static void main(String[] str) {

		Palindrome test = new Palindrome();

		//System.out.println(test.isPalindromeByString(12));
		
		System.out.println(test.isPalindromeByNumber(121));

	}
}
