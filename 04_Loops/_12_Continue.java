import java.util.Scanner ;
class _12_Continue{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Continue is used to skip and iteration
		do{

		System.out.print("Enter the value : ");
		int x = sc.nextInt();

		if(x == 5){
			continue;
		}
		else System.out.println("hi " + x);
	}while(true);
}
}