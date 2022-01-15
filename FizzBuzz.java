import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Solution(n);
	}

	private static void Solution(int o) {

		for (int n = 1; n <= o; n++) {

			if (n % 3 == 0 && n % 5 == 0)
				System.out.print("FizzBuzz");
			else if (n % 3 == 0)
				System.out.print("Fizz");
			else if (n % 5 == 0)
				System.out.print("Buzz");

			else
				System.out.print(n);
			
			System.out.print("\n");
		}
	}

}
