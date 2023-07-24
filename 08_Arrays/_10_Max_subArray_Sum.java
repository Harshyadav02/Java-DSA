class _10_Max_subArray_Sum{

	public static void subArray(int arr[]){
		
		int sum = 0;
		int max_sum = Integer.MIN_VALUE;
		
		for(int i=0; i<=arr.length-1; i++){
			int j = arr.length-1 ;
			while(i<=j){
				sum = 0;
				
				for(int k = i; k<=j; k++){

					sum += arr[k];
				}
				System.out.println(sum);
				max_sum = Math.max(sum , max_sum);
			j--;
			
			}
			System.out.println();
			
			
		}
	System.out.println("Maximum sum of the is = "+max_sum);
	}

	public static void main(String[] args) {
		int arr [] = {1,-2,6,-1,3};
		subArray(arr);
	}
}