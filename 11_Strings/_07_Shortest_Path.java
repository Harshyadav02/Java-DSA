class _07_Shortest_Path{

	public static double shortestPath(String str){
		int x1 = 0;
		int y1 = 0;
		int x2 = 0;
		int y2 = 0;
		for(int i=0; i<str.length(); i++){

			char direction = str.charAt(i);

			switch( direction){

			case 'E': x2 +=1; break;
			case 'W': x2 -=1; break;
			case 'N': y2 +=1; break;
			case 'S': y2 -=1; break; 
			default :
				System.out.println("No match found ");
			}
		}

		double sp = Math.sqrt(Math.pow((x2-x1) ,2)+ Math.pow((y2-y1) ,2) );
		return sp;
	}

	public static void main(String[] args) {
		String str = "WNEENESENNN";
		System.out.println(shortestPath(str));
	}
}