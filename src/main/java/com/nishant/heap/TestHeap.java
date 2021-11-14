package com.nishant.heap;

public class TestHeap {

    public static void main(String args[]){
        var heap = new Heap();
        heap.insert(10);
        heap.insert(5);
        heap.insert(22);
        heap.insert(17);

        System.out.println(heap);
    }

}
