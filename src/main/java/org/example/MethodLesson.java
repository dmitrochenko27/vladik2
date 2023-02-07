package org.example;

public class MethodLesson {
    public static void main(String[] args) {
        int[] array = {11, 22, 33, 44, 55, 66, 77, 88, 99};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(int[] array) {
        for (int i = 0; i < array.length/2 ; i++) {
            int temp;
            temp = array[array.length - i - 1];
            array[array.length - i - 1] = array[i];
            array[i] = temp;

        }

        //напишите тут ваш код
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
