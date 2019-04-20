package string;

import java.util.Scanner;

public class VovelsCount {

	public int countVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {

				count++;
			}
			System.out.print("\n"+str.charAt(i));

		}

		return count;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Input string \n");
		String word = sc.nextLine();
		System.out.println("Number of vowels in the string " + new VovelsCount().countVowels(word) + "\n");

	}

}
