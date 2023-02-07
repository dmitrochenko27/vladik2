package org.example;

public class MethodLessonMinBetweenFourNumber {
    public static int min(int a, int b, int c, int d) {
        if ( min(a , b) <= c && min(a , b) <= d) {
            return min(a , b);
        } else if (c <= min(a , b) && c <= d) {
            return c;

        }
        else {
            return d;
        }
        //напишите тут ваш код

    }

    public static int min(int a, int b) {
        if (a<b) {
            return a;
        }
        else {
            return b;
        }
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
