/*
	In bubble sort the large element some to the end of array by swapping with the adjacent element .
*/

class _01_Bubble_Sort{
	
	 public static int[] sort(int arr[]){

	 	for(int i=0 ; i<arr.length-1; i++){
	 		for(int j=0; j<arr.length-1-i; j++){

	 			if(arr[j] > arr[j+1]){
	 				// swaping
	 				int temp = arr[j];
	 				arr[j] = arr[j+1];
	 				arr[j+1] = temp;
	 			}
	 		}
	 	}
	 	return arr;
	}

	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};
		sort(arr);
		
		for(int x: arr){
			System.out.print(x+" ");
		}
	}
}