package org.example;

import java.util.Arrays;

public class ArrayClas {
    public static int[] array = new int[21];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        int firstPath = array.length % 2 ==0 ? array.length/2 : array.length/2 + 1;
        Arrays.fill(array , 0, firstPath , valueStart);
        Arrays.fill(array, firstPath , array.length , valueEnd);
        System.out.println(Arrays.toString(array));
    }
}
