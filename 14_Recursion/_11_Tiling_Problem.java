/*

Given a “2 x n” board and tiles of size “2 x 1”, count the number of ways to tile the given board using the 2 x 1 tiles. A tile can either be placed horizontally i.e., as a 1 x 2 tile or vertically i.e., as 2 x 1 tile. 


*/


class _11_Tilling_Problem{

	public static int tillingTile(int n){

		if(n == 0 || n == 1){

			return 1;
		} 

		// work 
		// verticle choice 

		int verticleTile  = tillingTile(n-1);

		// Horizontal choice

		int horizontalTile = tillingTile(n-2);


		// total ways 
		return verticleTile + horizontalTile;
	}

	public static void main(String[] args) {
		
		System.out.println(tillingTile(4));
	}
}