package com.abusair.training.javacollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkListArrayList {
    public static void main(String args[]) {
        ArrayList a;
        LinkedList ba;
        List<String> al = new ArrayList<String>();//creating arraylist
        al.add("Ravi");//adding object in arraylist
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        List<String> al2 = new LinkedList<String>();//creating linkedlist
        al2.add("James");//adding object in linkedlist
        al2.add("Serena");
        al2.add("Swati");
        al2.add("Junaid");

        System.out.println("arraylist: " + al);
        System.out.println("linkedlist: " + al2);
        Queue<String> queue = new LinkedList<String>();
    }
}
