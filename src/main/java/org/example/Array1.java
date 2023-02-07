package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array1 = new String[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = reader.readLine();
        }
        for (int j = 9; j >= 0 ; j--) {

            System.out.println(array1[j]);

        }


    }
}
