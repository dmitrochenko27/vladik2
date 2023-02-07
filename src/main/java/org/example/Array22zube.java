package org.example;

import java.util.Arrays;

public class Array22zube {
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < result.length; i++) {
            result[i] = new int[i + 1];
            for (int j = 0; j < result[i].length; j++) {
               // j = i +j;
               // result[i][j] =  j;
                result[i][j] = i + j;

                System.out.print(result[i][j]);
            }
            //    int[] ints = new int[i + 1];

            //  int [i] =new int[i + 1]
            System.out.println();
        }
        //напишите тут ваш код
    }
}

