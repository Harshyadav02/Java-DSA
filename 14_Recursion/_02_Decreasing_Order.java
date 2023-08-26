/*
	Program to print number through recursion 
*/
class _02_Decreasing_Order{

	public static void printNumber(int number){

		// Base case
		if(number == 1 || number  == 0) {
			System.out.print(number);
				
			return;
		} 
		// Work
		System.out.print(number+" ");
		
		// function calling for smaller value
		printNumber(number-1);
	}

	public static void main(String[] args) {
		
		printNumber(10);
	}

}