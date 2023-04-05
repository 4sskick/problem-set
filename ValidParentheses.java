import java.util.Scanner;
import java.util.Stack;

/*
 * in case input: '({)})'
 * would return 'valid' or 'invalid'
 *
 */

public class ValidParentheses {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        String s = "([{}])";
        String s = "{()}[]";
//        String s = "[()]{}{[()()]()}";

//        if (isValid(s)) {
        if (is_valid_arr(s)) {
//        if (is_valid(s)) {
            System.out.print("valid");
        } else {
            System.out.print("invalid");
        }
    }

    public static boolean isValid(String s) {

        Stack<Character> temp = new Stack<>();
        // ' } { '
        for (Character c : s.toCharArray()) {
//			if(c == '(' || c == '{' || c=='[') {
//				temp.push(c);
//			}
//			
//			if(c == ')' && !temp.isEmpty() && temp.peek() == '(') {
//				temp.pop();
//			}else if(c == '}' && !temp.isEmpty() && temp.peek() == '{') {
//				temp.pop();
//			}else if(c == ']' && !temp.isEmpty() && temp.peek() == '[') {
//				temp.pop();
//			}

            if (temp.isEmpty()) {
                temp.push(c);
            } else {
                if (c == ')' && temp.peek() == '(' || c == '(' && temp.peek() == ')')
                    temp.pop();
                else if (c == '}' && temp.peek() == '{' || c == '{' && temp.peek() == '}')
                    temp.pop();
                else if (c == ']' && temp.peek() == '[' || c == '[' && temp.peek() == ']')
                    temp.pop();
            }
        }

        return temp.isEmpty();
    }

    public static boolean is_valid(String s) {

        int length;

        do {
            length = s.length();
            s = s.replace("()", "").replace("{}", "").replace("[]", "");
        } while (length != s.length());

        return s.length() == 0;
    }

    public static boolean is_valid_arr(String s) {
        int i = 0;
        char[] ch = new char[s.length()];

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                ch[++i] = c;
            } else {
                if (i >= 0 && (
                        (ch[i] == '(' && c == ')')
                                || (ch[i] == '{' && c == '}')
                                || (ch[i] == '[' && c == ']')
                )) {
                    i--;
                } else {
                    return false;
                }
            }
        }
        return i <=0;
    }
}
