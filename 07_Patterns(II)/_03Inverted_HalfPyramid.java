/*
Print Inverted Half Pyramid
  		12345
		1234
		123
		12
		1




*/

import java.util.Scanner ;
class _03Inverted_HalfPyramid{

	public static void pattern(int rows){

		for(int i = 0; i <=rows; i++){
			for(int j = 1; j<=rows-i; j++){
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		pattern(num);
	}
}