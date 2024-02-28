package com.abusair.training.datastracture.ds;

public class LinkedListU<T> {
    Node head;

    public LinkedListU() {
        head = null;
    }

    public void add(Object value) {
        Node newNode = new Node(value, null);
        if (head == null)
            head = newNode;
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void delete() {
        head = head.next;

    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.println(n.value);
            n = n.next;
        }
    }


}
