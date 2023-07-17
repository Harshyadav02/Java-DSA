import java.util.Scanner;
class _08_PrimeRange{

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

	public static void isPrime(int n){
		for(int i = 0; i<=n; i++){
			boolean result = prime(i);

			if(result == true){
				System.out.print(i + " ");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the range : ");
		int range = sc.nextInt();
		isPrime(range);
	}
}