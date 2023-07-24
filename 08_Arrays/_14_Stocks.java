/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.
You want to maximize your profit by choosing a single day to buy one stock and choosing a different
day in the future to sell that stock. Return the maximum profit you can achieve from this transaction.
If you cannot achieve any profit, return 0.
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
*/

class _14_Stocks{

	public static int sellingStocks(int prices[]){

		/*  My Approch

		int bp = prices[0];
		int sp = 0;
		int index = prices[0];
		int maxProfit = 0;
		for(int i =1; i<prices.length; i++){

			// bp = Math.min(bp,prices[i]);
			// index = prices[i];

			if(bp > prices[i]){
				bp = prices[i];
				index = i;
			}

		}
		for(int j = index+1 ; j<prices.length; j++){
			sp = Math.max(sp,prices[j]);
		}
		maxProfit = sp - bp;
		return maxProfit; */


		
		// Effective Solution 
		int bp = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i = 0; i<prices.length; i++){

			if(bp < prices[i]){
				int profit = prices[i] - bp;
				maxProfit = Math.max(maxProfit,profit);
			}
			else{
				bp = prices[i];
			}
		}
		return maxProfit;
		
	}

	public static void main(String[] args) {
		int prices[] = {7,1,5,3,6,4};
		System.out.println(sellingStocks(prices));
	}
}