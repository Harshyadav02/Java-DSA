/*
      *       
    * * *     
  * * * * *   
* * * * * * * 
* * * * * * * 
  * * * * *   
    * * *     
      *  
*/
class _09_Diamond_Pattern{

	public static void pattern(int rows){
		// First Half
		
		for(int i = 1 ; i<=rows; i++){
			
			// For Spaces
			for(int j = 1; j<=rows-i ; j++){
				System.out.print("  ");
			}

			// For Stars
			for(int k = 1; k<=2*i-1; k++){
				System.out.print("* ");
				
			}


			// For Spaces
			for(int j = 1; j<=rows-i ; j++){
				System.out.print("  ");
			}

			System.out.println();
		}


		// Second Half

		for(int i = rows ; i>=1; i--){
			
			// For Spaces
			for(int j = 1; j<=rows-i ; j++){
				System.out.print("  ");
			}

			// For Stars
			for(int k = 1; k<=2*i-1; k++){
				System.out.print("* ");
				
			}


			// For Spaces
			for(int j = 1; j<=rows-i ; j++){
				System.out.print("  ");
			}

			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern(4);
	}
}