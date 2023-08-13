
class _06_Binary_RightShift{

	public static void main(String[] args) {
		
		/*
		
		Binary Right shift opperator ( >> ) shift the number toward right

		for example :-

		5 >> 2 

		00000101(binary of 5)  --> will be shifted right side and chopOf last 2 number because of (5 << 2) so the final output will be --> 000101
		
		0 0 0 0 0 1 0 1   --->  	0 0 0 0 0 1 
		_ _ _ _ _ _ _ _         _ _ _ _ _ _ _ _
		
		The intail remaing empty space will be filled by 0 so the final output will be 

		0 0 0 0 0 1 0 1   --->  0 0	0 0	0 0 0 1  
		_ _ _ _ _ _ _ _         _ _ _ _ _ _ _ _
	
	 	if 2 is replced with 3 then 3 number will be chopOf and so on ...



		*/

		System.out.println(5>>2);   // Output 1;

		/*
		 You will find that the resultant is always (first_number / 2**second_number)
		
		*/

	}

}