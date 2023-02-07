package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Arr2a22y2 {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int u = scanner.nextInt();
        array = new char[u][u];
        int mul = u * u;
        int a = 0;
        int b = 0;
        for (int i = 0; i < mul; i++) {
            array[a][b] = i % 2 == 0 ? '#' : '_';
            b++;
            if (b % u == 0) {
                a++;
                b = 0;
               // System.out.println("k");
            }
        }

        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {
                System.out.print(array[i][i1] + "");
            }
            System.out.println();
        }

    }
}