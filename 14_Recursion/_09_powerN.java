/*
	Calculate power of the number 
*/

class _09_powerN{

	public static int powerOfX(int number , int power){

		if( power == 1){

			return number;
		}
		return number * powerOfX(number , power-1);
	}

	public static void main(String[] args) {
		
		System.out.println(powerOfX(2,5));
	}
}