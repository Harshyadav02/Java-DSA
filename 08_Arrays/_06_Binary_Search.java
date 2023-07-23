class _06_Binary_Search{

	public static int search(int arr[],int key){

		 int start = 0 ,end = arr.length-1;

		 while(start<=end){
		 	
		 	int mid = (start+end)/2;

		 	if(key == arr[mid]){
		 		return mid;
		 	}
		 	
		 	//  Right part
		 	else if(key > arr[mid]){
		 		start = mid+1;
		 	}
		 	// left Part
		 	else{
		 		end = mid-1;
		 	}
		 	
		}
		return -1;

	}

	public static void main(String[] args) {
		int arr [] = {2,3,4,5,6,7,8};
		System.out.println("Element found at index : "+search(arr,5));
	}
}