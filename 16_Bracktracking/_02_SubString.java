/*

print all the subsets of string 

*/

class _02_SubString{

	public static void findSubsets(String str, String ans , int index){

		// base case
			if(index == str.length()){
				System.out.println(ans);
				return;
			}
		

		//yes 

		findSubsets(str , ans+str.charAt(index) , index+1);

		// no 
		findSubsets(str , ans , index+1);

	}

	public static void main(String[] args) {
		
		String str = "abc";
		findSubsets(str , "",0);
	}
}