package practise.week1.loops;

import java.util.Scanner;

public class NumberOfDays {
	
	public static String [] Months = 
		{"Janvuary","Febravury","March","April","May","June",
		 "July","August","September","October","November","December"};
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the Month number");
		int month= scan.nextInt();
		scan.close();
		
		getDays(month);
	}

	private static void getDays(int month) {
		
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			System.out.println(Months[month-1]+" has 31 days");
		}else if(month==4||month==6||month==9||month==11) {
			System.out.println(Months[month-1]+" has 30 days");
		}else if(month==2) {
			System.out.println(Months[month-1]+" has 28 days");
		}else {
			System.out.println("Enter a valid month");
		}		
		
	}

}
