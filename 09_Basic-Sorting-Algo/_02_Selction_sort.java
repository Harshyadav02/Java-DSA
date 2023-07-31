/* The basic idea of selction sort is to bring the smallest element at first and reduce the unnessacery swaps*/

class _02_Selction_sort{

	public static int[] sort(int arr[]){

		for(int i = 0; i<arr.length-1; i++){

				int minimum = i ;
				

				for(int j = 1; j<=arr.length-1; j++){

						if(arr[minimum]  > arr[j]){

							minimum = j;
						}
				}

			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;


		}

		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};

		for(int x : arr){
			System.out.print(x + " ");
		}
	}
}