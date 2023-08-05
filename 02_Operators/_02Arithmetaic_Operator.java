class _02Arithmetaic_Operator{
	public static void main(String[] args) {
		
		// Binary Operators (+ , - , * ,/,%)

			//  + operator

			float first_value = 10;
			float second_value = 20;

			System.out.println(" Using + Operator : "+ (first_value+second_value));
			System.out.println(" Using - Operator : "+ (first_value-second_value));
			System.out.println(" Using * Operator : "+ (first_value*second_value));
			System.out.println(" Using / Operator : "+ (first_value/second_value));

			// % will provide us reminder
			System.out.println(" Using % Operator : "+first_value%second_value);


		// Unary Operator 
			
		/*	1) Unary Operators need only single varible to perform operation 

			2) Two types of Unary operator Increment and decrement ==> Inceremet is denoted and ++ and Decrement  by -- 

			3) Two type of Increment 
					
					i) Post increment (a++)
					ii) Pre Increment (++a) 

					In Pre Increment (++a)  First value will increment and then value will be used 

					In Post increment (a++)  First value will  used  and then value will increment 

			4) Two type of Decrement 
					
					i) Post decrement (a--)
					ii) Pre decrement (--a) 

					In Pre decrement (--a)  First value will decrement and then value will be used 

					In Post decrement (a--)  First value will  used  and then value will decrement 


		*/
			// Increment Operator

			// Pre Increment
				int value = 2;
				System.out.println(value); // Output => 2
				int incremented_value = ++value; 
				System.out.println(incremented_value); // Output => 3

			// Post Increment
				int val = 2;
				System.out.println(val); // Output => 2
				int postIncremented_value = val++; 
				System.out.println(postIncremented_value); // Output => 2
				System.out.println(val); // Output => 3


			// Decrement Operator 

			// Pre Decrement
				int value_3 = 2;
				System.out.println(value_3); // Output => 2
				int preDecremented_value = --value_3; 
				System.out.println(preDecremented_value); // Output => 1

			// Post Decrement
				int value_4 = 2;
				System.out.println(value_4); // Output => 2
				int postDecremented_value = value_4--; 
				System.out.println(postDecremented_value); // Output => 2
				System.out.println(value_4); // Output => 1











	}
}