import java.util.Scanner;
class _08_charAt{
	public static void main(String[] args) {

		Scanner scanner_object = new Scanner(System.in);
		// chatAt(0) is used to take a single character 
		char char_value = scanner_object.next().charAt(0);

		System.out.println(char_value);
	}
}