package org.example;

public class Arr22ay {
    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int i = 0; i < MULTIPLICATION_TABLE.length; i++) {
            for (int j = 0; j < MULTIPLICATION_TABLE.length; j++) {
                int i1 = (i+1) * (j+1);
                MULTIPLICATION_TABLE[i][j] = i1;
                System.out.print(i1 + " ");
            }
            System.out.println();


        }

        //напишите тут ваш код
    }
}
