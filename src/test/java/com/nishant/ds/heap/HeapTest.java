package com.nishant.ds.heap;

import org.junit.jupiter.api.Test;

class HeapTest extends Heap {

    @Test
    void testInsert() {
        var heap = new Heap();
        heap.insert(10);
        heap.insert(5);
        heap.insert(22);
        heap.insert(17);

        System.out.println(heap);
    }
}