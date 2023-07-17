class _02_MethodParameter{

	// Method with parameter
	// here x, y are parameter
	public static int m1(int x ,int y){

		x = 10;
		y = 20;

		return x+y;

		// the return type is based on the parameter type
		
		// Note :- return is always the last statment no other stament can be written after it if we write we will get compilation error saying ==>  error: unreachable statement

		//System.out.println("hi");
	}


	public static void main(String[] args) {
		
		// here 1,2 are argument to m1() method
		System.out.println(m1(1,2));
	}
}