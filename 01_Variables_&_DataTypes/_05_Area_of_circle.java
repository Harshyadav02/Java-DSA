import java.util.Scanner;

class _05_Area_of_circle{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of Radius: ");
		float radius = sc.nextFloat();
		
		double area = 2*3.14*radius*radius;

		System.out.println("The area of circle is :"+area);
	}
}