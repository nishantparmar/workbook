package com.nishant.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    Graph graph;
    @BeforeEach
    void setUp() {
        graph = new Graph() ;
    }

    @Test
    void addNodes() {
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
//        graph.addNode("D");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
//        graph.addEdge("A", "D");
//        graph.addEdge("B", "C");
        graph.print();
        graph.removeNode("C");
        graph.print();
    }
}