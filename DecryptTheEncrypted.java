import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/*
 * case input: 'world hel2o'
 * would return 'hello world'
 * 
 * another case input: 'seaside the to sent be to ne2ds army ten of team a'
 * would return 'a team of ten army needs to be sent to the seaside'
 * 
 * operation to use:
 * - reverse
 * - decrypting input
 */

public class DecryptTheEncrypted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		System.out.print(Solution(s));
	}

	public static String Solution(String encrypted) {

		Queue<String> sTemp = new LinkedList();
		String[] sSplit = encrypted.split(" ");

		StringBuilder str = new StringBuilder();

		for (int i = sSplit.length - 1; i >= 0; i--) {
			sTemp.add(sSplit[i]);
			
			for(Character c: sSplit[i].toCharArray()) {
//				if()
			}
		}

		System.out.println(sTemp);

		System.out.println(sTemp.remove());
		System.out.println(sTemp);

		return str.toString();
	}

}
