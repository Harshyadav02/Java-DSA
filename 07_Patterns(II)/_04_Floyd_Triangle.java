import java.util.Scanner;
class _04_Floyd_Triangle{

	public static void pattern(int n){

		int value = 1;

		for(int i = 1; i<=n; i++){

			for(int j = 1; j<=i; j++){
				System.out.print(value + " ");
				value++;
			}
			System.out.println();
		}

		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
			pattern(num);
		}
	}