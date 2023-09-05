/* given two index ind1 , indx2 swap there elemen*/

import java.util.ArrayList;

class _05_Swaping{

	public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list); // [10,20,30,40]

		int indx1 = 0 , indx2 = 2 ;

		// swaping the value of given index

		int temp = list.get(0);
		list.set(indx1 ,list.get(indx2));
		list.set(indx2 , temp);

		System.out.println(list); // [30,20,10,40]
	}
}