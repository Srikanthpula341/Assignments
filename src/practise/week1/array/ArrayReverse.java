package practise.week1.array;

import java.util.Scanner;

public class ArrayReverse {

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
		reverseArray(arr);
		System.out.println("\nAfter reverse");
		getArray(arr);
		

	}

	private static int[] reverseArray(int[] arr) {
		
		if(arr.length==0 || arr.length==1) {
			return arr;
		}
		int half=(arr.length)/2;
		int len =arr.length-1;
		for(int i=0;i<half;i++) {
			int temp=arr[i];
			arr[i]=arr[len-i];
			arr[len-i]=temp;
		}
	
		return arr;
		
	}

	private static void getArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
