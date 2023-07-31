/*
Java  has an inbuilt sort method which can be  used on array

To use it import the Arrays module form .util package;


*/

import java.util.Arrays;


class _04_Inbuilt_Sort{

	public static int[] inbuiltSort(int arr[]){
		
		// Using sort method
			Arrays.sort(arr);

			//  We can also use the below syntex
			
			// Array.sort(arr , starting_index , end_index);
			return arr;
	}

	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};
		inbuiltSort(arr);

		for(int array : arr){
			System.out.print(array +" ");
		}
	}
}