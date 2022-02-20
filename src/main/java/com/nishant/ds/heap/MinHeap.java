package com.nishant.ds.heap;

import java.util.Arrays;

public class MinHeap {
    private int capacity = 10;
    private int size = 0;
    int[] items = new int[capacity];

    public int peek(){
        if(size==0) throw new IllegalStateException();
        return items[0];
    }

    public int poll(){
        if(size==0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size-1];
        size--;
        //heapifyDown(); TODO
        return item;
    }

    private int getLeftChildIndex(int parentIndex) {
        return 2 * parentIndex + 1;
    }

    private int getRightChildIndex(int parentIndex) {
        return 2 * parentIndex + 2;
    }

    private int getParentIndex(int childIndex) {
        return (childIndex - 1) / 2;
    }

    private boolean hasLeftChild(int index) {
        return getLeftChildIndex(index) < size;
    }

    private boolean hasRightChild(int index) {
        return getRightChildIndex(index) < size;
    }

    private boolean hasParent(int index) {
        return getParentIndex(index) >= 0;
    }

    private int leftChild(int index) {
        return items[getLeftChildIndex(index)];
    }

    private int rightChild(int index) {
        return items[getRightChildIndex(index)];
    }

    private int parent(int index) {
        return items[getParentIndex(index)];
    }

    private void swap(int indexOne, int indexTwo){
        int temp = items[indexOne];
        items[indexOne] = items[indexTwo];
        items[indexTwo] = temp;
    }

    private void ensureExtraCapacity(){
        if(size==capacity){
            items = Arrays.copyOf(items, capacity*2);
            capacity = capacity*2;
        }
    }

}
