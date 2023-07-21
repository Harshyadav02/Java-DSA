import java.util.Scanner ;
class _03_Input_In_Array{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int marks[] = new int[5];

		// here marks[i] represent the index when i = 0  mean marks[0] 
		
		for(int i = 0; i<marks.length; i++){

			marks[i] = sc.nextInt();
		}

		
	}
}