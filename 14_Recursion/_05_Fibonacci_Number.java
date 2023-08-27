class _05_Fibonacci_Number{

	public static int calculateFibonacci(int number){

		// base case
		if(number == 0 || number == 1) return number;

		int fnm1 = calculateFibonacci(number-1);
		int fnm2 = calculateFibonacci(number-2);

		return fnm2 + fnm1;  


	}

	public static void main(String[] args) {
		
			System.out.print(calculateFibonacci(25));
	}
}