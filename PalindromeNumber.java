
/*
 * determine whether an integer us a palindrome. An integer is a palindrome when
 * it reads the same backwards as forwards
 * 
 * example 1:
 * 
 * input x = 232
 * 
 * output = true, because when `232` reads backwards will be a same number
 * 
 * 
 * example 2:
 * 
 * input x = 232-
 * 
 * output = false, because when it reads from backwards, it becomes `-232` and
 * that's not palindrome
 * 
 * @author monta
 * 
 *         thought before code:
 * 
 *         how to do reverse?
 * 
 *         - we can use modulo operation by 10 to keep track of input variable
 * 
 *         - it gonna return residue value which can't be divide by 10 (digit)
 * 
 *         - then multiple reverse by 10 and increment by digit
 * 
 *         - remove the rightmost input using division operation
 * 
 *         - input = input / 10
 * 
 *         - after process all digit of input then will compare with reverse
 * 
 * 
 * 
 *         pseudocode:
 * 
 *         -validate input parameter `if 'input` is negative return false;
 * 
 *         - create 2 variables {reverse: 0 and copy: input}
 * 
 *         - while `copy` > 0 do
 * 
 *         - retrieve rightmost digit -> digit = copy % 10;
 * 
 *         - multiply `reverse` by 10 then increment by `digit`
 * 
 *         - remove rightmost digit -> copy = copy / 10;
 * 
 *         - stop loop then return true if `reverse` equal to `input`
 * 
 * 
 * 
 *         what about time and space complexity:
 * 
 *         - time complexity gonna be O(log x), whoch x is the input value
 * 
 *         - O(log x) process each of the digit of `x`
 * 
 *         - space complexity o(1)
 * 
 * 
 * 
 *
 */

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input = 54545;

		System.out.print(isPalindrome(input));

	}

	public static boolean isPalindrome(int input) {
		if (input < 0)
			return false;

		int reverse = 0, copy = input;

		while (copy > 0) {
			int digit = copy % 10;
			reverse = reverse * 10 + digit;
			copy /= 10;
		}

		return reverse == input;
	}

}
