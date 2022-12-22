package practise.week1.array;

import java.util.Scanner;

public class HollowSquare {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of pattern");
		int hollow = scan.nextInt();
		scan.close();
		getHollow(hollow);

	}

	private static void getHollow(int rect) {
		
		for(int i=0;i<rect;i++) {
			for(int j=0;j<rect;j++) {
				if(i==0 || i==rect-1 || j==0 || j==rect-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}

}
