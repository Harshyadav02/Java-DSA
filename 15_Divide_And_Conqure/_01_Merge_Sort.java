/*
	Merge sort 

	Steps 
		1) Divide the array from b/w till we have an single element
		2) now merge the array element into sorted way into another array
*/
class _01_Merge_Sort{

	public static void sort(int arr[] , int startingIndex , int endingIndex){

		// base case 

		if(startingIndex >= endingIndex) {
			return ;
		}
		
		// dividing the array
		int mid = startingIndex + (endingIndex -startingIndex) /2 ;

		// left part 
		sort(arr , startingIndex , mid);

		
		// right part 
		sort(arr , mid +1 , endingIndex);

		// merge function for merging the element 
		merge(arr,startingIndex , mid, endingIndex);
	}

	// method which will merge the array 

	public static void merge(int arr[] , int startingIndex , int mid , int  endingIndex){

		int temp [] = new int[endingIndex - startingIndex+1]; 
		
		// i is the iterator for left part
		int i = startingIndex ;

		// j is the iterator for Right part
		int  j = mid +1;

		// k is iterator for temp array
		int k = 0;


		while( i<= mid && j <=endingIndex){

			if(arr[i] < arr[j]){
				temp[k++] = arr[i++];
			}
			else{
				temp[k++] = arr[j++];
			}
		}

		// if right is finished but not left  part 

		while(i <= mid){

			temp[k++] = arr[i++]; 
		}

		// if left is finished but not right part 

		while(j <= endingIndex){

			temp[k++] = arr[j++]; 
		}

		// copy temp array to my original array 

		for (int p = 0, l = startingIndex; p < temp.length; p++, l++) {
    		
    		arr[l] = temp[p];
    	}
	}
	
	public static void main(String[] args) {
		int arr []= {6,3,9,5,2,8};

		sort(arr , 0 , arr.length-1);
		
		for (int num : arr) {
    		
    		System.out.println(num + " ");
    	}

	}
}