import java.util.Scanner ;
class _03_Print_N_Number{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int num = sc.nextInt();

		int x = 1;
		while(x <= num){
			System.out.println(x);
			x++;
		}
	}
}