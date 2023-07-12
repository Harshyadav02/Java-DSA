class _02Arithmetaic_Operator{
	public static void main(String[] args) {
		
		// Binary Operators (+ , - , * ,/,%)

			//  + operator

			float x = 10;
			float y = 20;

			System.out.println(" Using + Operator : "+ (x+y));
			System.out.println(" Using - Operator : "+ (x-y));
			System.out.println(" Using * Operator : "+ (x*y));
			System.out.println(" Using / Operator : "+ (x/y));

			// % will provide us reminder
			System.out.println(" Using % Operator : "+x%y);


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
				int a = 2;
				System.out.println(a); // Output => 2
				int b = ++a; 
				System.out.println(b); // Output => 3

			// Post Increment
				int q = 2;
				System.out.println(q); // Output => 2
				int r = q++; 
				System.out.println(r); // Output => 2
				System.out.println(q); // Output => 3


			// Decrement Operator 

			// Pre Decrement
				int v = 2;
				System.out.println(v); // Output => 2
				int w = --v; 
				System.out.println(w); // Output => 1

			// Post Decrement
				int t = 2;
				System.out.println(t); // Output => 2
				int s = t--; 
				System.out.println(s); // Output => 2
				System.out.println(t); // Output => 1











	}
}