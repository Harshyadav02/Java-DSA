/*
	Clear last i bit
*/

// Importing Scanner class for input
import java.util.Scanner;

class _12_Clear_Last_IBit
{

	// Method for setting the ith bit

	public static int clear_last_i_bit(int user_input , int iBit){
		int bitMask = (~0)<<iBit;
		return user_input & bitMask;
	}

	public static void main(String[] args) {
		
		// Scanner class Object to take input

		Scanner SCANNER_OBJECT = new Scanner(System.in);

		// USER INPUT 

		System.out.print("Enter your desired number: ");
		int user_input = SCANNER_OBJECT.nextInt();

		System.out.print("Enter the ith Bit ");
		int iBit = SCANNER_OBJECT.nextInt();

		//Method calling
		System.out.println(clear_last_i_bit(user_input,iBit));
	}

}