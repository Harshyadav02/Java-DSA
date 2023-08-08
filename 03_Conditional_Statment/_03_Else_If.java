import java.util.Scanner;

class _03_Elseif{
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		// Elseif used for multiple condition 

		System.out.print("Enter the value of x: ");
		int x  = sc.nextInt();
		int y = 10;
		
		if (x == y) {
		 	System.out.println(" x is eqaul to 10 ");
		 } 

		else if(x > y){
			System.out.println("x is Greater then y");
		}

		else{
			System.out.println("x is smaller then y");
		}
	}
}
