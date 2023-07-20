/*
Print Hollow Rhombus 
		* * * * * 
	   *       * 
	  *       * 
	 *       * 
	* * * * * 

*/

import java.util.Scanner ;

class _08_Hollow_Rhombus{

	public static void pattern(int rows){
		 
		for(int i = 1; i<=rows; i++){
			
			// For Spaces
			for(int j = 1 ; j<=rows-i ; j++){
				System.out.print(" ");
			}
			
			// For Stars
			for(int k = 1; k<=rows; k++){
				
				if(i == 1 || i== rows || k==1 || k==rows){
					System.out.print("* ");
				}
				
				else System.out.print("  ");
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);

		System.out.print("Enter The Number : ");
		int rows = sc.nextInt();
		pattern(rows);
	}
}