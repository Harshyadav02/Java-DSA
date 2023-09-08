/*You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.*/

import java.util.ArrayList;
class _08_Container_With_Most_Water{


	public static int storeWater(ArrayList<Integer> height){

		int  maxWater = 0;

		int leftPointer = 0;
		int rightPointer = height.size()-1;

		while(leftPointer < rightPointer){

			// calulate the area of water

			int waterHeight = Math.min(height.get(leftPointer) ,height.get(rightPointer));

			int waterWidth = rightPointer - leftPointer  ;

			int currentWater = waterHeight * waterWidth;

			maxWater = Math.max(maxWater , currentWater); 


			// updating pointers

			if( height.get(leftPointer) < height.get(rightPointer)){
				leftPointer ++;
			}

			else{
				rightPointer -- ;
			}



		}
		return maxWater;  
		
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> height = new ArrayList<>();

		height.add(1);
		height.add(8);
		height.add(6);
		height.add(2);
		height.add(5);
		height.add(4);
		height.add(8);
		height.add(3);
		height.add(7);


		System.out.println(storeWater(height));  // 49 

	}
}