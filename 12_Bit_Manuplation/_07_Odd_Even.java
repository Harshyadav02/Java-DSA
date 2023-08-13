/* Check wheter the Given number is odd or even */

import java.util.Scanner;

class  _07_Odd_Even{

	// Method for finding Wheater the given number is Odd or Even 

	public static void OddEven(int user_input){

		// For Odd Condtion
		if((user_input & 1) == 1){
			System.out.println("Given Number is Odd Number");
		}

		// for Even condition
		else {System.out.println("Given number is Even Number");}
	}

	public static void main(String[] args) {
		
		//  Object creation of Scanner class for input

		Scanner SCANNER_OBJECT = new Scanner(System.in);

		// Taking User Input
		
		System.out.print("Enter your desired number : ");

		int user_input = SCANNER_OBJECT.nextInt();
	
		
		// Method Calling
			
		OddEven(user_input);

	}
}