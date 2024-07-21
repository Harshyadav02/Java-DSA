package com.Package.Heap;
import java.util.PriorityQueue;
class _01_Priority_Queue{


	public static void main(String[] args) {
		

		// Creating a priority queue 

		PriorityQueue<Integer> queue = new PriorityQueue<>();


		// adding element in queue 

		queue.add(3);
		queue.add(4);
		queue.add(1);
		queue.add(2);
		queue.add(9);
		queue.add(5);
		queue.add(6);

		System.out.println(queue);

		// removing elements 

		while(!queue.isEmpty()){
			System.out.println(queue.peek());
			queue.remove();
		}

	}
}