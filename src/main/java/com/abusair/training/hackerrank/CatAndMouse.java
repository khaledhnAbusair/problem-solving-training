package com.abusair.training.hackerrank;

public class CatAndMouse {
    static String catAndMouse(int catA, int catB, int mouse) {
        int catAUnit = Math.abs(mouse - catA);
        int catBUnit = Math.abs(mouse - catB);
        if (catAUnit == catBUnit)
            return "Mouse C";
        if (catAUnit < catBUnit)
            return "Cat A";
        return "Cat B";
    }

    static String catAndMouse2(int catA, int catB, int mouse) {
        int catAUnit = mouse - catA;
        int catBUnit = mouse - catB;

        // Convert negative units to positive
        if (catAUnit < 0)
            catAUnit = -catAUnit;

        if (catBUnit < 0)
            catBUnit = -catBUnit;

        if (catAUnit == catBUnit)
            return "Mouse C";
        if (catAUnit < catBUnit)
            return "Cat A";
        return "Cat B";
    }


    public static void main(String[] args) {
        System.out.println(catAndMouse(1, 2, 3));
        System.out.println(catAndMouse(1, 3, 2));
        System.out.println(catAndMouse(5, 3, 10));
    }
}
