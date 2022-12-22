package practise.week1.array;

import java.util.HashMap;
import java.util.Scanner;

public class RemoveUnsortedDuplications {

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
		
		
		System.out.println("\nBefore removing duplications");
		getArray(arr);
		System.out.println();
		removeDuplicantsArray(arr);
		//System.out.println("\nAfter removing duplications");
		//getArray(arr);
		

	}

	private static int[] removeDuplicantsArray(int[] arr) {
		
		if(arr.length==0 || arr.length==1) {
			return arr;
		}
		HashMap<Integer, Integer> hasharr= new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			hasharr.put(i,arr[i]);
			
		}
		int newARR[]=new int [hasharr.size()];
		for(int i=0;i<hasharr.size();i++) {
			//newARR[i]=hasharr.get(i);
			System.out.print(hasharr.get(i));
		}
	
	
		return newARR;
		
	}

	private static void getArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
}
