import java.util.Scanner;

class _01_Star_Pattern{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();

		// Way 1 to print star 
		for(int i=0 ;  i<x ; i++){
			for(int j = 0; j<=i; j++){
				System.out.print("*");
			}
			System.out.print("\n");
		}
/*---------------------------------------------------------------------------------------------------------*/

		// Way 2 to print star

		for(int i=1 ;  i<=x ; i++){
				System.out.println("*".repeat(i));

			
		}
	}
}
