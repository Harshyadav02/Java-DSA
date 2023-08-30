/*
	Quick sort works on pivot and partation approach 


	Steps for Quick sort

	1) Choose a pivot (A point where our array will rotate)
	
	2) make partation of arrya w.r.t pivoit  element  
*/

class _02_Quick_Sort{

	public static void sort(int arr[] , int startingIndex , int endingIndex){

		if(startingIndex >= endingIndex){
			return;
		}

		

		// partation w.r.t pivoit

		int pidx = partation(arr, startingIndex , endingIndex);

		// left part
		sort(arr , startingIndex , pidx -1);

		// Right part
		sort(arr , pidx +1 , endingIndex);

	}

	public static int partation(int arr[] , int startingIndex , int endingIndex){

		//  last element as pivoit
		int pivoit = arr[endingIndex];

		// helper is an helper which will make place for smaller then pivoit
		int helper = startingIndex -1;

		for(int i = startingIndex ; i < endingIndex ; i++){

			if(arr[i] <= pivoit){

				helper++ ;

				int temp = arr[i];
				arr[i] = arr[helper];
				arr[helper] = temp; 
			}
		}

		helper++ ;
		int temp = pivoit;
		arr[endingIndex] = arr[helper];
		arr[helper] = temp; 


		return helper;
	}

	public static void main(String[] args) {
		
		int arr [] = {6,3,9,8,2,5};

		sort(arr, 0 , arr.length-1);

		for(int x : arr){
			System.out.print(x + " ");
		}
	}
}