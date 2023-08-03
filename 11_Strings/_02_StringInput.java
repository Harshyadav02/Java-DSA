import java.util.Scanner ;
class _02_StringInput{


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// Input in String way-1 

		String str = sc.next();
		System.out.println(str);


		// Input in String way-2

		String name = sc.nextLine();
		System.out.print(name);
	}
}

/*
	Note :-  next() takes only a single word as input 

			 nextLine() takes line or para as a input
*/