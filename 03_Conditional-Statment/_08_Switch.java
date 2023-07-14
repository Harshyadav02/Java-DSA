class _08_Switch{
	public static void main(String[] args) {
		// Switch uesd for multiple condtion same as if else

		/*
			Syntex :-

				switch(variable){
				case 1:
					pass
				case 2:
					pass
				default:
					pass
				}
				
		*/

		int number = 2;

		switch(number){
		case 1: System.out.println("Number is equal to 1"); break;

		case 2: System.out.println("Number is equal to 2"); break;

		default:
			System.out.println("No value matched");
			break;


		}




	}
}