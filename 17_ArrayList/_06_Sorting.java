/*
	Sorting in arraylist is done by sort() method present in Collections Class

*/


import java.util.ArrayList;
import java.util.Collections;

class _06_Sorting{

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<>();
		
		list.add(110);
		list.add(-20);
		list.add(30);
		list.add(-40);
		System.out.println(list); // [110,-20,30,-40]

		// sorting in asc order
		
		Collections.sort(list);
		System.out.println(list); //[-40, -20, 30, 110] 

		// sorting in desc order  , the below sorting is done by the use of compartor
		Collections.sort(list , Collections.reverseOrder());
		System.out.println(list); // [110, 30, -20, -40]

	}
}