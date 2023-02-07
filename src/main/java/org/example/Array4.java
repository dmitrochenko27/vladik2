package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Array4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[15];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(reader.readLine());
        }
        int odd = 0;
        int even = 0;
        for (int j = 0; j < number.length; j++) {
            if (j == 0) {
                even += number[j];
            }
            if (j % 2 == 0) {
                even += number[j];
            }
            odd += number[j];

        }
        if (even < odd) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
        else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }


        //напишите тут ваш код
    }
}

