class _05_Binomial_Coefficient{

	public static int BinomialCoefficient(int n , int r ,int nmr){
		int Coff = n/(r*nmr);
			return Coff;
	}

	public static int factorial(int num){
		int fact = 1;
		for(int i = 1 ;i<=num; i++){

			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		int n = 5;
		int r = 2;
		int fact_n = factorial(n);
		int fact_r = factorial(r);
		int nmr = factorial(n-r); 
		System.out.println(BinomialCoefficient(fact_n,fact_r,nmr));

	}

}
