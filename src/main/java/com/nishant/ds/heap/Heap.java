package com.nishant.ds.heap;

import com.nishant.Utilities;

public class Heap {

    private int[] items = new int[10];
    private int size;

    public void insert(int value){
        if(size == items.length) throw new IllegalStateException();
        items[size++] = value;
        bubbleUp();
    }

    private void bubbleUp(){
        var index = size - 1;
        while (index > 0 && items[index] > items[parent(index)]){
            Utilities.swap(items, index, parent(index));
            index = parent(index);
        }
    }
    private int parent(int index){
        return (index -1)/2;
    }

}
