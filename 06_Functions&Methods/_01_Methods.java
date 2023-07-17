class _01_Methods{

	/*
	
	Methods or Function are a block of code while can be reused as per our requiremnts

	Syntex :-

		returnType name(){
			
			//body

			return statment;
		}

	*/

	//A Sample of Function 

	public static void printHello(){
		System.out.println("Hello world");
	}
	/*
	Points to be noted 

		1) public is used because jvm can access the function anywhere 

		2) static is written so that whitout creating a object i can access the function or method 

		3) void represents that the function will not return any value 

		4) () are used that if a function takes parameter


		5) The upper code is code is called function decalrtion , function must be called to the main method 
	*/

	public static void main(String[] args) {
		// calling the method
		printHello();
	}
}