class _07_isPrime{

	public static boolean prime(int n){

		// Corner cases 

		if(n <= 3) return true;
		
		for(int i = 0; i<=Math.sqrt(n); i++){
			
			if(n %2 ==0){
				return false;
			}
		}
		
		return true;
				
	}

	public static void main(String[] args) {
		System.out.println(prime(8));
	}
}