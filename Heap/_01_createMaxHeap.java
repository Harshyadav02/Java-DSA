import java.util.ArrayList;

public class _01_createMaxHeap{


    //  method to create maxHeap
    public static void insert(ArrayList<Integer> heap,int ele){
        // adding an element to heap
        heap.add(ele);
        int index = (heap.size() -1);
        
        while(index > 0){
            // finding the parent index to the inserted element
            int parentIndex = (index-1)/2 ;

            // if the parent element is smaller then child parent means the element is palced wrong swap them
            if(heap.get(parentIndex)<heap.get(index)){

                int temp = heap.get(parentIndex);
                heap.set(parentIndex, heap.get(index));
                heap.set(index, temp);
            }
            // now change the parent index
            index = parentIndex;
            
        }

    }
    public static void main(String[] args) {
        
        // creating a mean heap
        ArrayList<Integer> heap = new ArrayList<>();
        int array[] = {8,7,6,9};
        for(int ele: array){

            insert(heap,ele);
        }
        System.out.println(heap);
    }
}