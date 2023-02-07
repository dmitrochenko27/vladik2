package org.example;

import java.util.Arrays;

import static java.util.Arrays.fill;
//import static sun.security.util.Debug.args;

public class Check {

        public static void fill(int[] data, int from, int to, int value)
        {
            if (from < 0 || to > data.length)
                return;

            for (int i = from; i < to; i++)
            {
                data[i] = value;
            }
        }

        public static void main(String[] args){
           // num();

            System.out.println(num());


            int[] months = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12};
            fill(months, 2, 10, 8);
            System.out.println(Arrays.toString(months));
            int [] test = new int[10];
            Arrays.fill(test, 0 ,test.length - 1, 5);
            System.out.println(Arrays.toString(test));
        }
        public static int num(){
            int d = 4+6;
            return d;

        }
    }

