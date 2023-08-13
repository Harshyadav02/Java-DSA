/*
	Get the ith bit of the given number
*/

import java.util.Scanner;

class _08_Get_IthBit{

	// method to get ith bit

	public static int get_ithBit(int user_input, int ithBit){

		if(((user_input >> ithBit)& 1) == 1 ){

			return 1;
		}
		return 0;
	}
	public static void main(String[] args) {

		// Scanner class Object to take input from user

		Scanner SCANNER_OBJECT = new Scanner(System.in);
		
		// Taking user input

		System.out.print("Enter your desired number " );
		int user_input = SCANNER_OBJECT.nextInt();

		System.out.println("Enter the ith bit " );
		int ithBit = SCANNER_OBJECT.nextInt();

		// Method calling

		System.out.println(get_ithBit(user_input,ithBit));

	}
}