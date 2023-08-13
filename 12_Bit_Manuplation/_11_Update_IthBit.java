/*
	Update ith bit
*/

// Importing Scanner class for input
import java.util.Scanner;

class _11_Update_IthBit
{

	// Method for setting the ith bit

	public static int update_ith_bit(int user_input , int ithBit , int update_value){

		if (update_value == 0){
			return clear_ith_bit(user_input,ithBit);

		}
		else {
			return set_ith_bit(user_input,ithBit);
		}
	}

	public static int clear_ith_bit(int user_input , int ithBit){

		int bitMask = ~(1<<ithBit);
		return user_input & bitMask;
	}

	public static int set_ith_bit(int user_input , int ithBit){

		int bitMask = 1<<ithBit;
		return user_input | bitMask;
	}

	public static void main(String[] args) {
		
		// Scanner class Object to take input

		Scanner SCANNER_OBJECT = new Scanner(System.in);

		// USER INPUT 

		System.out.print("Enter your desired number: ");
		int user_input = SCANNER_OBJECT.nextInt();

		System.out.print("Enter the ith Bit ");
		int ithBit = SCANNER_OBJECT.nextInt();

		System.out.print("Enter the update value: ");
		int update_value = SCANNER_OBJECT.nextInt();

		//Method calling
		System.out.println(update_ith_bit(user_input,ithBit,update_value));
	}

}