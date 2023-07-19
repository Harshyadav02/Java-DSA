/*
Print Rotated Half Pyramid 

	      *
	    * *
	  * * *
	* * * *
  * * * * *

*/

import java.util.Scanner ;
class _02Rotated_HalfPyramid{

	public static void pattern(int rows){
		for(int i = 1; i<=rows ; i++){
			
			// for spaces
			for(int j = 1; j<=rows-i; j++){
				System.out.print(" ");
			}

			//for Stars
			for(int k = 1 ; k<=i; k++){
				System.out.print("*");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows : ");
		int rows = sc.nextInt();
		pattern(rows);
	}


}