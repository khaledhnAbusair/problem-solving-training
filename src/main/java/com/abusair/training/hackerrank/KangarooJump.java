package com.abusair.training.hackerrank;

public class KangarooJump {

    public static void main(String[] args) {
        System.out.println(kangaroo(0, 3, 4, 2));

    }

    static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 >= 0 && x2 > x1 && x2 <= 10000) {
            if (validJumpValue(v1) && validJumpValue(v2)) {
                for (int i = 0; i <= 10000; i++) {
                    int k1 = x1 += v1;
                    int k2 = x2 += v2;
                    if (k1 == k2)
                        return "YES";
                }

            } else
                return "NO";
        } else
            return "NO";

        return "NO";
    }

    static boolean validJumpValue(int v) {
        return v >= 1 && v <= 10000;
    }

}
