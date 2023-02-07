package org.example;

public class Arr1ay22 {
    public static char[][] chars = {
            {'a', 'b', 'c', 'd', 'e', 'f'},
            {'j', 'h', 'i', 'j', 'k', 'l'},
            {'m', 'n', 'o', 'p', 'q', 'r'},
            {'s', 't', 'u', 'v', 'w', 'x'}
    };

    public static void main(String[] args) {
        printArray();
        for (int i = 0; i < chars.length; i++) {
            if (i ==0 || i == chars.length -1) {
                continue;
            }
            for (int j = 0; j < chars[i].length; j++) {
                if (j == 0 || j == chars[i].length -1) {
                    continue;
                }
                chars[i][j] = '-';
            }
        }

      //  System.out.println(chars.length);
        //напишите тут ваш код

        printArray();
    }

    private static void printArray() {
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
