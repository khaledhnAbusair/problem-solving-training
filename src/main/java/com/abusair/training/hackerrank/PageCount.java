package com.abusair.training.hackerrank;

public class PageCount {
    public static int pageCount(int n, int p) {

        return Math.min(n / 2 - p / 2, p / 2);
    }




    public static void main(String[] args) {
        //The first line contains an integer n, the number of pages in the book.
        //The second line contains an integer,p , the page to turn to.
        System.out.println(pageCount(5, 4));
    }

}
