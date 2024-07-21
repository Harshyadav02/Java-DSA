/*  This file contains the logic of  removing an element fron an heap */

package com.Package.Heap;

import java.util.Collections;

public class _03_RemoveElement {
    MinHeap  minHeap = new MinHeap();
    public int removeElementFormHeap(){

        if(minHeap.heap.isEmpty()){
            return -1;
        }

        int length = minHeap.heap.size()-1;
        int data = minHeap.heap.get(0);

        // swap first and last element
        Collections.swap(minHeap.heap,0,length);
        
        // delete last element
        minHeap.heap.remove(length);

        // heapify 
        heapify(0);
        return data;
    }
    
    private void heapify(int root) {
        
        int length = minHeap.heap.size()-1;
        
        // find left index of root
        int rootLeft = 2*root +1;
        
        // find right index of root
        int rootRight = 2*root +2;

        // assuming minIndex in root index
        int minIndex = root;

        // check if left index exist in heap and left element is smaller then minmum element.
        if(rootLeft <= length && minHeap.heap.get(rootLeft)< minHeap.heap.get(minIndex)){

            // make left index as min
            minIndex =rootLeft;
        }
        // check if right index exist in heap and right element is smaller then minmum element
        if(rootRight <= length && minHeap.heap.get(rootRight)< minHeap.heap.get(minIndex)){

            //make right index as min
            minIndex=rootRight;
        }

        // if minIndex have changed then 
        if(minIndex != root){

            // swao the heap[root] and the heap[minIndex]
            Collections.swap(minHeap.heap, root,minIndex);

            // call heapify again if maintain the minHeap 
            heapify(minIndex);
        }
       
    }
    public static void main(String[] args) {
        
        _03_RemoveElement r = new _03_RemoveElement();

        r.minHeap.add(2);
        r.minHeap.add(4);
        r.minHeap.add(6);
        r.minHeap.add(3);
        r.minHeap.add(1);
        r.minHeap.printheap();
        System.out.println(r.removeElementFormHeap());
        r.minHeap.printheap();

    }
}
