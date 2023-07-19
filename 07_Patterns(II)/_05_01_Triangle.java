class _05_01_Triangle{
	public static void pattern(int rows){

		for(int i = 0; i<=rows;i++){
			for(int j =0; j<=i; j++){

				if((i+j)%2 == 0){
					System.out.print(1);
				}
				else System.out.print(0);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		pattern(5);
	}
}