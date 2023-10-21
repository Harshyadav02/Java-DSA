/******************************************************************************
    
                        BUBBLE SORT BY RECURSION 

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void bubblesort(int arr[] , int i , int j){
        
        if(i == arr.length-1){
            return  ;
        }
        
        if(j < arr.length-1-i)
        {
            if(arr[j] > arr[j+1]){
                
                int temp = arr[j] ;
                arr[j] = arr[j+1];
                arr[j+1] = temp ;
                
                bubblesort(arr , i , j+1);
            }
            bubblesort(arr , i , j+1);
            
            
        }else bubblesort(arr , i+1 , 0);
        
        
    }
    
	public static void main(String[] args) {
	    
	    int arr[] = {5,4,3,2,1};
		bubblesort(arr, 0, 0);
		System.out.print(Arrays.toString(arr));
	}
}
