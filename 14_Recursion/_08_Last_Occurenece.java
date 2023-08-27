class _08_Last_Occurenece{


	public static int lastOccurence(int arr[],int key, int i){

		// Base case 
		if(i == arr.length){

			return -1;
		}

		int isFound = lastOccurence(arr, key, i+1);
		
		if(isFound == -1  && arr[i] == key){

			return i;
		}

		

		return isFound;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,5,4,5};

		System.out.println(lastOccurence(arr,5 ,0));
	}
}