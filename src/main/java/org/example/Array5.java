package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Array5 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        int[] number = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = reader.readLine();
        }
            for (int j = 0; j < str.length; j++){
                number[j] = str[j].length();
                //System.out.println(number[j]);
           }
        for (int j : number) {


            System.out.println(j);

        }

        }
        //for (int i = 0; i < str.length; i++) {


        }



