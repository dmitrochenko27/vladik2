package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Array22zub2 {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countRows = Integer.parseInt(scanner.nextLine());
        multiArray = new int[countRows][];
        for (int i = 0; i < countRows; i++) {
            int countFields = Integer.parseInt(scanner.nextLine());
            multiArray[i] = new int[countFields];
        }
        //System.out.println();
        System.out.println(Arrays.toString(multiArray));



/*

        //  int[][] multiArray = new int[scanner.nextInt()][];
        int[] temp = new int[Integer.parseInt(scanner.nextLine())];
        for (int i = 0; i < multiArray.length; i++) {

            for (int i1 = 0; i1 < temp.length; i1++) {
                temp = new int[i1];
//            for (int i1 = 0; i1 < multiArray[i].length; i1++) {
//                multiArray[i][i1] = scanner.nextInt();
//                System.out.print(multiArray[i][i1]);
//            }
                System.out.print(temp);
            }
            System.out.println();
        }*/

        //напишите тут ваш код
    }
}
