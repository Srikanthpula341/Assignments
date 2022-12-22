package practise.week1.array;

import java.util.Scanner;

public class RemoveSortedDuplications {


	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter no. of elements you want in array:");
		int n = scan.nextInt();
		int a[] = new int[n + 1];
		System.out.println("Enter all the elements:");

		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}

		n = remove_duplicate_elements(a, n);
		System.out.print("Array after removing : ");
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

	}
	private static void getArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}
	public static int remove_duplicate_elements(int arr[], int n) {

		if (n == 0 || n == 1)
			return n;

		int temp[] = new int[n];

		int j = 0;
		int i;
		for (i = 0; i < n - 1; i++)
			if (arr[i] != arr[i + 1])
				temp[j++] = arr[i];
		temp[j++] = arr[n - 1];

		for (i = 0; i < j; i++)
			arr[i] = temp[i];

		return j;
	}

}
