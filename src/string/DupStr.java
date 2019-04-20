package string;

import java.util.Scanner;

public class DupStr {

	public static int countVow(String str) {
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {

				count++;
			}
		}
		return count;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input String \n");
		String inputString = sc.nextLine();
		System.out.println("The vowels counts in " + inputString + " are: " +countVow(inputString));
		sc.close();
	}

}
