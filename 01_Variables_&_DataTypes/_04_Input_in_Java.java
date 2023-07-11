// To Take input we have to import and module named Scanner

import java.util.Scanner ;

class _04_Input_in_Java{
	public static void main(String args[]){
		
		// Created an object of Scanner class an sc is a reference variable ,System.in refer to input
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter the value of x: ");
		// nextInt used to take integer input
		int x = sc.nextInt();

		System.out.print("Enter the value of f: ");
		// nextFloat used to take Float input
		float f = sc.nextFloat();

		System.out.print("Enter the value of d: ");
		// nextDouble used to take Double input
		double d = sc.nextDouble();

		System.out.print("Enter the value of s: ");
		// next used to take a single word input
		String s = sc.next();
		

		System.out.print("Enter the value of sl: ");
		// nextLine used to take sting (a sentance) as input
		String sl = sc.nextLine();

		System.out.println();
		System.out.println("The output are below: ");
		System.out.println(x);
		System.out.println(f);
		System.out.println(d);
		System.out.println(s);
		System.out.println(sl);
		


	}
}