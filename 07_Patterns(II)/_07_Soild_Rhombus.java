/* Print Solid Rhombus

 	*****    
   *****   
  *****  
 ***** 
*****
*/

import java.util.Scanner;

class _07_Soild_Rhombus{

	public static void pattern(int rows){
		for(int i = 1; i<=rows; i++){
			// Way - 1
			// for Spaces
			for(int j = 1 ; j<=rows-i; j++){
				System.out.print(" ");
			}

			// for Stars 
			for(int k = 1 ; k<=rows; k++){
				System.out.print("*");
			}

/*------------------------------------------------------------------------*/
	        // Way - 2
			System.out.print(" ".repeat(rows-i));
			System.out.print("*".repeat(rows));
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