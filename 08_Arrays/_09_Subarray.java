class _09_Subarray{

	public static void subArray(int arr[]){

		for(int i=0; i<=arr.length-1; i++){
			int j = arr.length-1 ;
			while(i<=j){
				System.out.print("[");
				for(int k = i; k<=j; k++){

					System.out.print( arr[k]+" ");
				}
			j--;
			System.out.print("]");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		int arr [] = {2,4,6,8,10};
		subArray(arr);
	}
}