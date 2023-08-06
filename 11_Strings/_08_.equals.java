class _08_.equals{

	/*

	when we make string without new for example

	String s1 = "Harsh"
	String s1 = "Harsh"

	here s1 and s2 are equal because s1 and s2 are pointing to the same object 

	but when we make Sting by new keyword  a new string is created 

	== compare the values at object level
	*/

	public static void main(String[] args) {
		
		String s1 = "Harsh";
		String s2 = "Harsh" ;

		String s3 = new Sting("Harsh");

		if(s1 == s2) System.out.println("s1 and s2 are equal");   // Output :- Both are equal



		if(s1 == s3) System.out.println("s1 and s2 are equal");  // Output :- Both are not equal

	}
	
}
