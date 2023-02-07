package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[10];
        for (int i = 0; i < 10; i++) {
            number[i] = Integer.parseInt(reader.readLine());

        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(number[i]);

        }

    }
}
