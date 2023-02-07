package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Томас");
        cats[1] = new Cat("Бегемот");
        cats[2] = new Cat("Филипп Маркович");
        cats[3] = new Cat("Пушок");

        cats[1] = null;


        for (int i = 2; i < cats.length ; i++) {
            //перемещаем элементы к началу, чтобы пустая ячейка оказалась в конце
            cats[i - 1] = cats[i];
            cats[i] = null;
        }

        System.out.println(Arrays.toString(cats));
//        ArrayList<Cat> cats = new ArrayList<>();
//
//

//        Cat thomas = new Cat("Томас");
//        Cat behemoth = new Cat("Бегемот");
//        Cat philipp = new Cat("Филипп Маркович");
//        Cat pushok = new Cat("Пушок");
//
//        cats.add(thomas);
//        cats.add(behemoth);
//        cats.add(philipp);
//        cats.add(pushok);
//
//        System.out.println(cats.size());
//
//        System.out.println("Hello world!");
    }
}