package com.abusair.training.datastracture.ds;

public class StackDArrayDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        StackDArray<Integer> st = new StackDArray<Integer>(2);
        st.push(1);
        st.push(2);
        System.out.println("Size stack:" + st.getSize());
        st.push(3);
        System.out.println("Size stack:" + st.getSize());
    }

}
