import java.util.Scanner;
class _09_Calculator{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number : ");
		float a = sc.nextFloat();
		
		System.out.print("Enter Second number : ");
		float b = sc.nextFloat();

		System.out.println("""
			Press + - * / %""");
		char s = sc.next().charAt(0);

		

		switch(s){

			case '+':System.out.println(a+b);
					 	break;
			
			case '-':System.out.println(a-b);
						break;
			
			case '*':System.out.println(a*b);
				     	break;
			
			case '/':System.out.println(a/b);
						break;
			case '%':System.out.println(a%b);
						break;

			default:
				System.out.println("Enter valid Sign");
		}


	}
}
