package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Array3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[20];
        int[] number1 = new int[10];
        int[] number2 = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = Integer.parseInt(reader.readLine());
            //System.out.println(number[i]);

        }
        //int[] number1
        System.arraycopy(number , 0 , number1 , 0 , 10 );
     //  System.out.println(Arrays.toString(number1));
        System.arraycopy(number , 10 , number2 , 0 , 10 );
      //  System.out.println(Arrays.toString(number2));
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);

        }

    }
}
