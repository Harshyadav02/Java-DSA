class _07_Reverse_an_Array{

	public static int[] reverse(int arr[]){
		int i= 0 , j= arr.length-1;

		while(i<j){

		 	int temp = arr[i];
		 	arr[i] = arr[j];
		 	arr[j] = temp;

		 	i++;
		 	j--;
		}
		return arr;
	}

	public static void main(String[] args) {
		
		
			int arr[] = {1,2,3,4,5};
			reverse(arr);
			
			for(int array : arr){
				System.out.print(array+ " ");
			}

		
	}

}