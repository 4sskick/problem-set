import java.util.Scanner;
import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ops = sc.nextLine().split(" ");

		System.out.println(callPoint(ops));
	}

	public static int callPoint(String[] ops) {
		int result = 0;
		Stack<Integer> st = new Stack();

		for (int i = 0; i < ops.length; i++) {
			if (ops[i].equals("+")) {
				st.push(st.get(st.size() - 1) + st.get(st.size() - 2));
			} else if (ops[i].equals("D")) {
				st.push(st.get(st.size() - 1) * 2);
			} else if (ops[i].equals("C")) {
				st.pop();
			} else {
				st.push(Integer.parseInt(ops[i]));
			}
		}

		while (st.size() > 0) {
			result += st.pop();
		}

		return result;
	}
}
