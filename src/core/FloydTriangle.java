package core;

import java.util.Scanner;

public class FloydTriangle {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = sc.nextInt();
		int n = 0;
		for (int i = 0; i < rows; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print(++n + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
