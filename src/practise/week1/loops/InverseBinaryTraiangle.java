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
		int count=0;
	
		for(int i=0;i<triangle;i=i+2) {
			
			for(int j=0;j<triangle;j++) {
				
				if(i<=j) {
					
					if(count%2==0 ) {
						
						System.out.print(1);
					}else {
						System.out.print(0);
					}
					count++;
				}else {
					System.out.print(" ");
				}
			}
			if(count%2==1) {
				count++;
			}else {
				
			}
			System.out.println();
		}
//		int n=triangle;
//		//int count=0;
//		for(int i=1;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(++count);
//			}
//			System.out.println();
//		}
	

	}

}
