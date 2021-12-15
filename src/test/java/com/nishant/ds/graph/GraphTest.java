package com.nishant.ds.graph;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GraphTest extends Graph{

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

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");

        graph.print();

        //graph.removeEdge("A", "C");
        graph.removeNode("B");

        graph.print();
    }

    @Test
    void traverseDepthFirst() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.traverseDepthFirst("A");

    }

    @Test
    void traverseBreadthFirst() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.traverseBreadthFirst("A");
    }
}