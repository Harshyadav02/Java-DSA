/*
Given n friends, each one can remain single or can be paired up with some other friend. Each friend can be paired only once. Find out the total number of ways in which friends can remain single or can be paired up. 
*/

class _12_Friends_Pairing_Problem{

	public static int pairing(int friends){

		if(friends == 1 || friends == 2){

			return friends;
		}

		// choice

		// single 

		int single = pairing(friends-1);

		// pair

		int pair = pairing(friends -2);

		int pairWays = (friends -1) * pair;  

		return single + pairWays;
	}

	public static void main(String[] args) {
		
		System.out.println(pairing(3));
	}
}