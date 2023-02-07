package org.example;

import java.util.Arrays;

public class ArrayBinarySearch {
    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    // private static boolean metodSerch() {
    //  return false;


    public static void main(String[] args) {
        System.out.println(metodSerch());
    }
        private static boolean metodSerch () {
            int[] arrayCopy = (Arrays.copyOf(array, array.length));
            Arrays.sort(arrayCopy);
            int index = Arrays.binarySearch(arrayCopy, element);
            //index > 0 ? true, false ;
            if (index > 0) {
                return true;
            } else {
                return false;
            }
            // System.out.println(Arrays.toString(arrayCopy));
            //напишите тут ваш код
        }
    }

