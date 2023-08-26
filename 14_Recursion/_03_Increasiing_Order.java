/* Printing number till n in increasing order*/

class _03_Increasiing_Order {


		public static void printNumber(int number){

		// Base case
		if(number == 1) {
			System.out.print(number+" ");
				
			return;
		} 
		
		// function calling for smaller value
		printNumber(number-1);
		
		// Work
		System.out.print(number+" ");
		
		
		
	}
	public static void main(String[] args) {
		
		printNumber(10);
	}

}