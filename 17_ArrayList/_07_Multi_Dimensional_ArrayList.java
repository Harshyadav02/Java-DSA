/*
	Creating multi dimensional arraylist
*/

import java.util.ArrayList;

class _07_Multi_Dimensional_ArrayList{

	public static void main(String[] args) {
		

		// Creating arraylist of arraylsit

		ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();  

		// creating another arryalist having random number
		ArrayList <Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);


		// creating another arryalist having 2 multiple
		ArrayList <Integer> Two_list = new ArrayList<>();

		Two_list.add(2);
		Two_list.add(4);
		Two_list.add(6);
		Two_list.add(8);


		// creating another arryalist having 3 multiple
		ArrayList <Integer> Three_list = new ArrayList<>();

		Three_list.add(3);
		Three_list.add(6);
		Three_list.add(9);
		Three_list.add(12);


		// Inserting all the created list into the main list list
		mainList.add(list);
		mainList.add(Two_list);
		mainList.add(Three_list);

		// Printing the main list
		System.out.println(mainList); // [[1, 2, 3, 4], [2, 4, 6, 8], [3, 6, 9, 12]]
	}

}