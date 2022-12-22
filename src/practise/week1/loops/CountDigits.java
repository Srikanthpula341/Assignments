package practise.week1.loops;

import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive number");
		int num =scan.nextInt();
		scan.close();
		
		if(num<0) {
			System.out.println("you entered negitive interger so run again  ");
		}else {
			System.out.println("Numner of digits in "+num+" is"+getDigits(num));
		}

	}

	private static int getDigits(int num) {
	
		int count =0;
		
		while(num!=0) {
			count=count+(num%10);
			num=num/10;
		}
		return count;
	}

}
