class _04_Factorial{

	public static int factorial(int number){

		// base case

		if(number == 1 || number == 0) return 1;

		// work  and calling inner function

		return number*(factorial(number-1));
	}

	public static void main(String[] args) {
		
		System.out.println(factorial(5));   // 120
	}
}