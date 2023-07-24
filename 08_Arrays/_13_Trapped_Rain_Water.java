class _13_Trapped_Rain_Water{

	public static int rainTrappedWater(int height[],int width){

		// Calculate max-left boundary - helper array

		int leftMax [] = new int[height.length];

		leftMax[0]= height[0];
		for(int i= 1; i<leftMax.length; i++){

			leftMax[i] = Math.max(height[i],leftMax[i-1]);
		}

		// Calculate max-Right boundary - helper array

		int rightMax [] = new int[height.length];

		rightMax[rightMax.length-1]= height[height.length-1];
		for(int i = rightMax.length-2; i>=0; i--){

			rightMax[i] = Math.max(height[i],rightMax[i+1]);
		}
		
		int trappedWater = 0;
		for(int i = 0; i<height.length; i++){
			
			// waterlevel = min(left_max , right_max)
			int waterlevel = Math.min(leftMax[i], rightMax[i]);

			//trapped water = (waterlevel- height[i])*width

			trappedWater += (waterlevel - height[i])*width;

		}

		
		return trappedWater;
	}

	public static void main(String[] args) {
		int height[] = {4,2,0,6,3,2,5};
		System.out.println(rainTrappedWater(height,1));
	}
}