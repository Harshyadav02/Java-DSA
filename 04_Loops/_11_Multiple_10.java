import java.util.Scanner;
class _11_Multiple_10{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		do{	System.out.print("Enter your number : ");
			int x = sc.nextInt();

			if(x%10 == 0)break;

			System.out.println(x);
		}while(true);

	}
}