package com.nishant.linkedlist;

public class TestLinkedList {

    public static void main(String[] args){

        var next = new Node(200, null);
        var root = new Node(100, next);

        NodeList nodeList = new NodeList(root);

        var firstNode= new Node(90, null);
        nodeList.addFirst(firstNode); //addFirst

        var lastNode= new Node(300, null);

        nodeList.addLast(lastNode); //addLast

        nodeList.deleteFirst(); //deleteFirst

        nodeList.deleteLast(); //deleteLast

        System.out.println(nodeList.contains(new Node(100, null)));//contains

        System.out.println(nodeList.indexOf(new Node(200, null)));//indexOf

        nodeList.reverse();

        System.out.println(nodeList);

        System.out.println(nodeList.size());//size
    }
}
