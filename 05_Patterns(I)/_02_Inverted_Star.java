import java.util.Scanner;

class _02_Inverted_Star{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();

		// Way 1 to print star 
		for(int i=x ;  i>=1 ; i--){
			for(int j = 1; j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
/*---------------------------------------------------------------------------------------------------------*/

		// Way 2 to print star

		for(int i=x ;  i>=1 ; i--){
				System.out.println("*".repeat(i));

			
		}
	}
}
