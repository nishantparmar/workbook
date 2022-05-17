package com.nishant.ds.graph;

import java.util.*;

public class Graph {
    private class Node {
        String label;

        public Node(String label) {
            this.label = label;
        }

        @Override
        public String toString() {
            return label;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return label.equals(node.label);
        }

        @Override
        public int hashCode() {
            return Objects.hash(label);
        }
    }

    private Map<String, Node> nodes = new HashMap<String, Node>();
    private Map<Node, List<Node>> adjacencyList = new HashMap<>();

    public void addNode(String label) {
        var node = new Node(label);
        nodes.putIfAbsent(label, node);
        adjacencyList.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if (fromNode == null || toNode == null) return;
        adjacencyList.get(fromNode).add(toNode);
    }

    public void removeEdge(String from, String to) {
        var fromNode = nodes.get(from);
        var toNode = nodes.get(to);
        if (fromNode == null || toNode == null) return;
        adjacencyList.get(fromNode).remove(toNode);
    }

    public void removeNode(String label) {
        if (nodes.get(label) == null) return;

        var node = new Node(label);
        for (var n : adjacencyList.keySet())
            adjacencyList.get(n).remove(node);//remove linkage

        adjacencyList.remove(node);
        nodes.remove(node);
    }

    public void print() {
        for (var source : adjacencyList.keySet()) {
            var targets = adjacencyList.get(source);
            if (!targets.isEmpty())
                System.out.println(source + " is connected to " + targets);
        }
    }

    public void traverseDepthFirst(String root) {
        if (nodes.get(root) == null) return;
        traverseDepthFirst(nodes.get(root), new HashSet<Node>());
    }

    public void traverseDepthFirst(Node node, Set<Node> visited) {
        System.out.println(node);
        visited.add(node);
        for (var n : adjacencyList.get(node)) {
            if (!visited.contains(n)) {
                traverseDepthFirst(n, visited);
            }
        }
    }

    public void traverseBreadthFirst(String root) {
        var node = nodes.get(root);
        if (node == null) return;

        Set<Node> visited = new HashSet<>();
        Queue<Node> queue = new ArrayDeque();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.remove();
            if (visited.contains(current))
                continue;

            visited.add(current);
            System.out.println(current);

            for (var neighbour : adjacencyList.get(current)) {
                if (!visited.contains(neighbour))
                    queue.add(neighbour);
            }
        }
    }

}
