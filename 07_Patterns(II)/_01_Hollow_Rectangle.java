/*
print Hollow Rectangle Tringle 

	* * * *
	*     *
	*     *
	*     *
	* * * * 


*/

import java.util.Scanner ;
class _01_Hollow_Rectangle{

	public static void pattern(int rows , int cols){

		// for rows
		for(int i = 1 ; i <=rows; i++){
			// for cols
			for(int j = 1; j <=cols; j++){
				
				// cells (i,j)
				if(i == 1 || i == rows  || j == 1 || j == cols){
					// Boundary cells
					System.out.print("* ");
				}
				// Inner cells
				else System.out.print("  ");
			}
			System.out.println();
	}
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number of Rows : ");
		int rows = sc.nextInt();
		
		System.out.print("Enter the Number of Cols : ");
		int cols = sc.nextInt();
		
		pattern(rows,cols);
	}
}
