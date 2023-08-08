class _06_Type_Conversion{
	public static void main(String args[]){
		// Implacit type conversion
		int first_value= 10;
		long  second_value = first_value;

		// Below conversion is not possible due to range of int and long
		/*
		long x = 10;
		int  y = x; */
		System.out.println(second_value);
	}
}
