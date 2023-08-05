class _11_StringBuilder{


	// this is the solution for the immutable string

	// if we create string by string builder the muttable if we make changes in string the change will be in same string no other string will be created.

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("hello");

		/* we can change any thing to string by toString() method but and only if the changabe thing is object 

		for example :- int a = 10; this cannot be changed into string but

		Integer b = 10; 
		this can be changed  because b is an object of Integer class

	-------------------------------------------------------------------------------------------------


	sb can also be changed to string because it is an object of StringBuilder class

		*/

	// changing sb to string  
		sb.toString();

	}

}