
/**
 * white a function to find the longest common prefix string amongst an array of
 * strings
 * 
 * example 1:
 * 
 * input: str = {'flower', 'flow', 'flight'}
 * 
 * output: 'fl'
 * 
 * 
 * 
 * example 2:
 * 
 * input str = {'dog', 'racecar', 'car'}
 * 
 * output '' -> empty string, there's no commong string among the input strings
 * 
 * @author monta
 *
 *
 *         thought before code:
 * 
 *         - initially we have the longest common prefix 'length', which is
 *         equal to the length of the first word
 * 
 *         - then comparing the first word with every other word
 * 
 *         - but only compare up the index up to 'length'
 * 
 *         - this because these no poin in checking for character after index
 * 
 *         - example: {'flower', 'flow', 'flight'}
 * 
 *         - first word gonna be 'flower' which have length 6 (index 0th - 5th)
 * 
 *         - then comparing to other word 'flow' which this word has shorter
 *         length than before, which is 4 (index 0th - 3th)
 * 
 *         - 'flower' with 'flow'
 *         
 *         - since 'flow' has shorter length than 'flower', then update current length from 6 to 4
 *         
 *         - then continue to compare to 
 *         
 *
 */

public class LonestCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
