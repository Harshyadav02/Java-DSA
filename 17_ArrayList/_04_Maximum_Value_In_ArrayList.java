import java.util.ArrayList;

class _04_Maximum_Value_In_ArrayList{

public static void main(String[] args) {
		
		ArrayList <Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		int max = Integer.MIN_VALUE;

	

		for(int i = 0 ; i < list.size() ; i++){

			max = Math.max(max , list.get(i));
		}
		
		System.out.println(max);  // 40
	}
}