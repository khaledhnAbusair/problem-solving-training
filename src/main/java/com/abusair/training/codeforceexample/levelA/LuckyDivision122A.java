package com.abusair.training.codeforceexample.levelA;

import java.util.Scanner;

public class LuckyDivision122A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        String str = String.valueOf(input);

        str.replaceAll("4", "");
        str.replaceAll("7", "");
        if (str.equals(""))
            System.out.println("YES");
        else if (almost(input))
            System.out.println("YES");
        else
            System.out.println("NO");
        scanner.close();
    }

    private static boolean almost(int x) {
        if (x % 4 == 0) return true;
        else if (x % 7 == 0) return true;
        else if (x % 44 == 0) return true;
        else if (x % 47 == 0) return true;
        else if (x % 77 == 0) return true;
        else if (x % 74 == 0) return true;
        else if (x % 444 == 0) return true;
        else if (x % 447 == 0) return true;
        else if (x % 474 == 0) return true;
        else if (x % 744 == 0) return true;
        else if (x % 777 == 0) return true;
        else if (x % 774 == 0) return true;
        else if (x % 747 == 0) return true;
        else return x % 477 == 0;

    }
}
