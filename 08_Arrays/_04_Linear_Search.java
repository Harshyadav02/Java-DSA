class _04_Linear_Search{

	public static void search(int arr [] ,int key){
		boolean place = false;
		for(int i = 0; i<arr.length; i++){

		   place = (key == arr[i]) ? true : false ;
		   
		}

		if(place == true){
			System.out.println("Element is present");
		}
		else System.out.println("Element is not present ");
	}

	public static void main(String[] args) {
		int arr[] = {1,2,8,4,7};
		int key = 7;
		search(arr,key);
	}
}