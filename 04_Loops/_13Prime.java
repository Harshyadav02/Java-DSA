import java.util.Scanner;

class _13Prime{
	public static void main(String[] args) {
		
		// Program to find prime number
		Scanner sc = new Scanner(System.in);

		boolean isPrime = true;
		
		System.out.print("Enter your desired number : ");
		int x = sc.nextInt();

		for(int i = 2; i< Math.sqrt(x); i++){
			if(x % i == 0){
				isPrime = false;
			}

			
		}
		if(isPrime == true){
				System.out.println("Number is Prime :");
			}
			else{
				System.out.println("Number is Not prime ");
			}

	}
}