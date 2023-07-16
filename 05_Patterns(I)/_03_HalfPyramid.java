import java.util.Scanner;

class _03_HalfPyramid{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();

		// // Way 1 to print star 
		for(int i=1 ;  i<=x ; i++){
			for(int j = 1; j<=i; j++){
				System.out.print(j);
			}
			System.out.print("\n");
		}

		
	}
}