import java.util.Scanner;
class _04_Income_tax{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double tax = 0;

		System.out.print("Enter Your Income : ");
		int income = sc.nextInt();

		if(income < 500000){
			tax = 0;
		}

		else if(income >= 500000 && income <= 1000000){
			tax = income * 0.2;

		}
		else{

			tax = income * 0.3;
		}	

		System.out.println("Your tax is : " +tax);


	}
}