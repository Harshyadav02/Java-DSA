class _05_Binary_LeftShift{

	public static void main(String[] args) {
		
		/*
		
		Binary Left shift opperator ( << ) shift the number toward left

		for example :-

		5 << 2 

		00000101(binary of 5)  --> will be shifted left side and chopOf intail 2 number because of (5 << 2) so the final output will be --> 000101
		
		0 0 0 0 0 1 0 1   --->  0 0 0 1 0 1 
		_ _ _ _ _ _ _ _         _ _ _ _ _ _ _ _
		
		The last remaing empty space will be filled by 0 so the final output will be 

		0 0 0 0 0 1 0 1   --->  0 0 0 1 0 1 0 0
		_ _ _ _ _ _ _ _         _ _ _ _ _ _ _ _
	
	 	if 2 is replced with 3 then 3 number will be chopOf and so on ...



		*/

		System.out.println(5<<2);   // Output 20;

		/*
		 You will find that the resultant is always (first_number * 2**second_number)
		
		*/

	}

}