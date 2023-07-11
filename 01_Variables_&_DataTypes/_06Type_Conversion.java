class _06Type_Conversion{
	public static void main(String args[]){
		// Implacit type conversion
		int x = 10;
		long  y = x;

		// Below conversion is not possible due to range of int and long
		/*
		long x = 10;
		int  y = x; */
		System.out.println(y);
	}
}