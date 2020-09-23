

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntToHex {
	public static void main(String[] args) {
		try {
			Scanner m = new Scanner(System.in);
			int input = m.nextInt();
			System.out.println(Integer.toHexString(input));
		} catch (InputMismatchException e) {
			System.out.println("you did not type an integer value");
		}

	}
}
