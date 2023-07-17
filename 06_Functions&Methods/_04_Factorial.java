class _04_Factorial{

	public static int factorial(int num){
		int fact = 1;
		for(int i = 1 ;i<=num; i++){

			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorial(6));
	}

	// Note this code will work fine for small number until and unsless the factorial of any number cross the range of interger (because we have taken input in integer)
}