package practise.week1.loops;

import java.util.Scanner;

public class InverseBinaryTraiangle {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of pattern");
		int length = scan.nextInt();
		scan.close();
		getPattern(length);

	}

	private static void getPattern(int triangle) {
	
		for(int i=0;i<triangle;i++) {
			for(int j=0;j<triangle;j++) {
				if(i<=j) {
					if(i%2==0 ) {
						System.out.print(0);
					}else {
						System.out.print(1);
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	

	}

}
