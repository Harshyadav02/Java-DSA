// To Take input we have to import and module named Scanner

import java.util.Scanner ;

class _04_Input_in_Java{
	public static void main(String args[]){
		
		// Created an object of Scanner class an sc is a reference variable ,System.in refer to input
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("Enter the integer value : ");
		// nextInt used to take integer input
		int integer_input = sc.nextInt();

		System.out.print("Enter the value of f: ");
		// nextFloat used to take Float input
		float float_input= sc.nextFloat();

		System.out.print("Enter the value of d: ");
		// nextDouble used to take Double input
		double double_input = sc.nextDouble();

		System.out.print("Enter the value of s: ");
		// next used to take a single word input
		String single_word_input = sc.next();
		

		System.out.print("Enter the value of sl: ");
		// nextLine used to take sting (a sentance) as input
		String string_line_input = sc.nextLine();

		System.out.println();
		System.out.println("The output are below: ");
		System.out.println(integer_input);
		System.out.println(float_input);
		System.out.println(double_input);
		System.out.println(single_word_input);
		System.out.println(string_line_input);
		
		sc.close();

	}
}