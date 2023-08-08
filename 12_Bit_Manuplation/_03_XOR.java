class _03_XOR{

	/*

	0 & 0 ---> 0

	0 & 1 ---> 1

	1 & 0 ---> 1

	1 & 1 ---> 0

	 For example :- 

	  5 & 6 ---> 4

	  5 --> 101(Binary of 5)
	  6 --> 110(Binary of 6)

	   101
	 & 110
	--------
	   011 ---> 3 
	*/
	public static void main(String[] args) {
		
		System.out.println(5 ^ 6);   // Output 3
	}
}