import java.util.Scanner ;
class _05_Sum_Of_N_Natural_Number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		int x = 1;
		int sum = 0;
		while(x <= num){
			sum += x;
			x++;
		}
	System.out.println("Sum of N Natural Number is : "+ sum);
} }
