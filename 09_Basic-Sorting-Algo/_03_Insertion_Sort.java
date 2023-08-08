public class _03_Insertion_Sort {

	public static int[] sort(int arr[]){

		for(int i=1; i<arr.length;i++){

			int current_element = arr[i];
			int prev_index = i-1;

			while(prev_index >=0 && arr[prev_index] > current_element){

				arr[prev_index+1] = arr[prev_index];
				prev_index --;
			}

			arr[prev_index+1] = current_element;	
		
		}

		return arr;

	}

	public static void main(String[] args) {
		int arr[] = {5,4,3,2,1};

		sort(arr);

		for(int array : arr){
			System.out.print(array + " ");
		}
	}

}
