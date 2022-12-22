package practise.week1.array;

import java.util.Scanner;

public class ForwardTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of pattern");
		int length = scan.nextInt();
		scan.close();
		getPattern(length);

	}

	private static void getPattern(int triangle) {
		// TODO Auto-generated method stub
		for (int i = 0; i < triangle; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for (int i = triangle - 1; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
