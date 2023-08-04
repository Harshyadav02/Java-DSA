class _06_Palindrome{

	public static boolean Palindrome(String str){

		String temp = "";
		for(int i=0; i<=str.length()/2; i++){

			if(str.charAt(i) != str.charAt(str.length()-1-i)){
				System.out.println("String is not Palindrome ");
				return false;
			}

			
		}
		return true;

		
	}

	public static void main(String[] args) {
		String str = "MOM";
		System.out.print(Palindrome(str));
	}
}