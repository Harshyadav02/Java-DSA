import java.util.Scanner;

class _02_Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows :" );
        int rows = sc.nextInt();
        System.out.print("Enter the number of Cols :" );
        int cols = sc.nextInt();

        // Creation of 2D Array 
        int arr[][] = new int[rows][cols];

        // Input in 2D Array 
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Print the 2D array to verify the input
        for (int ele[] : arr) {
            for (int element : ele) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Printing Number  of coloumn
        System.out.println(arr[0].length);
    }
}
