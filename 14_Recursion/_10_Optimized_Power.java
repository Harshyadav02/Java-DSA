/*
	Optimized solution to find power of an number 

	with time complexity of logn
*/

class _10_Optimized_Power{

	public static int powerOfX(int number, int power){

		if(power == 1){
			return number;
		}
		int powerCall = powerOfX(number, power/2) ;
		
		int halfPower = powerCall * powerCall ;

		// if power is odd
		if(power % 2 != 0){

			halfPower = number * halfPower; 
		}
		
		return halfPower;
	}

	public static void main(String[] args) {
		
		System.out.println(powerOfX(2, 10));

	}
}


if(n == 1){
			return number;
		}
		int powerCall = myPow(x, n/2) ;
		
		int halfPower = powerCall * powerCall ;

		// if power is odd
		if(n % 2 != 0){

			halfPower = x * halfPower; 
		}
		
		return halfPower;


	Harshyadav02
