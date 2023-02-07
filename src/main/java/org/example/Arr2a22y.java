package org.example;

import java.util.Scanner;

public class Arr2a22y {
    public static char[][] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int u = scanner.nextInt();
        array = new char[u][u];
        for (int i = 0; i < array.length; i++) {
//            if ( i%2==1){
//                System.out.println("jhjhgh");
//               // continue;
//            }

            for (int i1 = 0; i1 < array[i].length; i1++) {
                if ((i%2 ==0 && i1%2 ==0) || (i%2 ==1 && i1%2 ==1 )){
                    array[i][i1] = '#';
                    //break;
                } else {
                    array[i][i1] = '-';
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int i1 = 0; i1 < array[i].length; i1++) {

                System.out.print(array[i][i1] + "");

            }
            System.out.println();
        }




//
    }
}