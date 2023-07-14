import java.util.Scanner;
class _02_Odd_Even{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a desired Integer number: ");
		int value = sc.nextInt();

		if(value%2 == 0){
			System.out.println("Given value is Even Number ");
			}
		else{
			System.out.println("Given Number is Odd Number");
		}


		

	}
}