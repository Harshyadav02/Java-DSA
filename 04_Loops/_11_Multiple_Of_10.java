/*Break the loop if user input multiple of 10*/
import java.util.Scanner;
class _11_Multiple_Of_10{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		do{	System.out.print("Enter your number : ");
			int x = sc.nextInt();

			if(x%10 == 0)break;

			System.out.println(x);
		}while(true);

	}
}
