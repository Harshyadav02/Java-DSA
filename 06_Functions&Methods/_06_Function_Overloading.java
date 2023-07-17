class _06_Function_Overloading{
 	
 	// Function Overlaodng means method with same name but different parameter 


	/*--------------------------------------------------------------------------------*/

	// Using Parameter

		public static int sum(int a ,int b){
			return a + b;
		}

		// same name (sum) but different parameter
		public static int sum(int a ,int b , int c){
			return a + b + c;
		}



	/*-------------------------------------------------------------*/

	// Using Data Types

	    public static int sum(int a ,int b){
			return a + b;
		}

		// same name (sum) but different parameter
		
		public static float sum(float a ,float b , float c){
			return a + b + c;
		}





	/*-----------------------------------------------------------------------------------------*/
	public static void main(String[] args) {
		
		System.out.println(sum(4.0,3.0));
		System.out.println(sum(3,3));	
	}

}