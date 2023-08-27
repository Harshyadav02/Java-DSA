class _07_First_Occurence{

	public static int occurance(int arr[] , int i , int keyElement){

		if(i == arr.length)return -1;

		if(arr[i] == keyElement)return i;

		return occurance(arr,i+1,keyElement);

	}

	public static void main(String[] args) {
		int arr[] = {1,2,5,4,5};

		System.out.println(occurance(arr,0 ,5));
	}
}

// For first occurrence 
    public static int firstOccurance(int arr[], int keyElement, int i) {
        if (i == arr.length) return -1;

        if (arr[i] == keyElement) return i;

        return firstOccurance(arr, keyElement, i + 1);
    }
