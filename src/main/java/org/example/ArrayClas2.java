package org.example;

import java.util.Arrays;

public class ArrayClas2 {
    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,};

    public static void main(String[] args) {
        int firstPath = array.length%2 == 0 ? array.length/2 : array.length/2 + 1;
        result[0] = Arrays.copyOfRange(array, 0, firstPath);
        result[1] = Arrays.copyOfRange(array, firstPath, array.length);
      //  result = new int[][]{Arrays.copyOfRange(array, firstPath,  array.length )};



        //напишите тут ваш код
        System.out.println(Arrays.deepToString(result));
    }
}
