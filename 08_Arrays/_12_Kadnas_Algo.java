class _12_Kadnas_Algo{

	public static int subArray(int arr[]){
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++){

			currSum += arr[i];
			
			if(currSum < 0){
				currSum = 0;
			}
			maxSum = Math.max(currSum,maxSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		int arr[] = {-2,-3,4,-1,-2,1,5,-3};
		
		System.out.println(subArray(arr));
	}
}