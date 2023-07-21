class _05_Largest_Number{

	public static int largest(int arr[]){
		int maxi = Integer.MIN_VALUE ;

		for(int i = 0; i<arr.length; i++){

			maxi = Math.max(maxi,arr[i]);
		}
		return maxi;
	}

	public static void main(String[] args) {
		int arr[] = {1,7,2,6,4,5};
		System.out.print(largest(arr));
	}
}