package practise.week1.array;

import java.util.Scanner;

public class LeaderArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = scan.nextInt();
		int arr[]=new int[size];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		scan.close();
		
		
		System.out.println("\nBefore reverse");
		getArray(arr);
		leaderArray(arr,size,0);
		System.out.println("\nAfter reverse");
		getArray(arr);
		

	}

	private static int[] leaderArray(int[] arr,int size,int index) {
		
		if(arr.length==0 || arr.length==1) {
			return arr;
		}
		if(index==size) {
			return arr;
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]<arr[i+1]) {
				//arr.
			}
		}
		
	return null;
		
	}

	private static void getArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}


}
