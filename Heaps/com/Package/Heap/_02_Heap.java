package com.Package.Heap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinHeap{
    //Heap creation
    List<Integer> heap = new ArrayList<>();
     
    public void add(int data){
        heap.add(data);
        int indexOfLastInsertedElement  = heap.size()-1;
        
        // sawping the elements to maintain the min heap
        while(indexOfLastInsertedElement>0 ){
            // find the parent index of the inserted data
            int parentIndex = (indexOfLastInsertedElement-1)/2;

            if(heap.get(indexOfLastInsertedElement) < heap.get(parentIndex)){

                // int temp =  heap.get(indexOfLastInsertedElement);
                // heap.set(indexOfLastInsertedElement,heap.get(parentIndex));
                // heap.set(parentIndex,temp);
                Collections.swap(heap,indexOfLastInsertedElement,parentIndex);
            }
            indexOfLastInsertedElement = parentIndex;
            
        }
    }
    public void printheap(){
        System.out.println(heap);
    }
}

class MaxHeap{
    //Heap creation
    List<Integer> heap = new ArrayList<>();
     
    public void add(int data){
        heap.add(data);
        int indexOfLastInsertedElement  = heap.size()-1;
        

        // sawping the elements to maintain the min heap
        while(indexOfLastInsertedElement>0 ){
            // find the parent index of the inserted data
            int parentIndex = (indexOfLastInsertedElement-1)/2;

            if(heap.get(indexOfLastInsertedElement) > heap.get(parentIndex)){

                int temp =  heap.get(indexOfLastInsertedElement);
                heap.set(indexOfLastInsertedElement,heap.get(parentIndex));
                heap.set(parentIndex,temp);
            }
            indexOfLastInsertedElement = parentIndex;
            
        }
    }
    public void printheap(){
        System.out.println(heap);
    }
}

public class _02_Heap {
    
    public static void main(String[] args) {
        // MinHeap minHeap = new MinHeap();
        // MaxHeap maxHeap = new MaxHeap();
        // maxHeap.add(2);
        // maxHeap.add(3);
        // maxHeap.add(4);
        // maxHeap.add(5);
        // maxHeap.add(6);
        // maxHeap.add(1);
        // maxHeap.printheap();
    }
}
