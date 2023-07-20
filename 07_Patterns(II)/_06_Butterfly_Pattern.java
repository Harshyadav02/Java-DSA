/* Printing Butterfly Pattern
		
		*      *
		**    **
		***  ***
		********
		********
		***  ***
		**    **
		*      *

		Note :-  The first half is till row number 4 

				and second half is inverted part of first half


*/

import java.util.Scanner;
class _06_Butterfly_Pattern{

	public static void pattern(int rows){
		// Printing First Half
		for(int i = 1; i<=rows; i++){

			// Stars - i
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			// Spaces - 2*(n-i)
			for(int j=1; j<=2*(rows-i); j++){
				System.out.print(" ");
			}
			// Stars - i
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
	    }

	    // Print Second-Half

	    for(int i = rows; i>= 1; i--){
	    	// Stars - i
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			// Spaces - 2*(n-i)
			for(int j=1; j<=2*(rows-i); j++){
				System.out.print(" ");
			}
			// Stars - i
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.println();
	    }
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int rows = sc.nextInt();
		pattern(rows);
	}
}
