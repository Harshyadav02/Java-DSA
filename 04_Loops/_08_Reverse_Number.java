class _08_Reverse_Number{
	public static void main(String[] args) {
		int x = 233;

		
		while(x > 0){
			// to achive last digit of a number use num%10
			System.out.print(x%10);

			// to remove last digit of a number use num/10
			x = x/10;
		}
	}
}
