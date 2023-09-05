// Importinf ArrayList in java

import java.util.ArrayList;

class _02_Operations{




	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<>();

		// Operations in arraylist

		// Adding an element in ArrayList O(1)

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);


		// Printing the ArrayList
		System.out.println(list);  // [10, 20, 30, 40]


		// getting the element  O(1)

		// Arraylist.get(index)

		System.out.println(list.get(3)); // 40


		// Remove Element 

		// Arraylist.remove(index)
		
		System.out.println(list.remove(2));	 // 30 has been removed


		// seting the new element

		// Arraylist.set(index , value)

		list.set(0,22);
		System.out.println(list); // [22, 20, 40]



		// Contains element

		System.out.println(list.contains(22)); // true
		System.out.println(list.contains(23)); // false


		// Another way to use add function

		// list.add(index , value)

		list.add(1,222);
		System.out.println(list);




		// size of an arryalist

		System.out.println(list.size()); // 4
	}

}