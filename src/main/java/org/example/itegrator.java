package org.example;

import java.util.*;

public class itegrator {


    public static void print(ArrayList<String> words) {
        HashSet<String> s = new HashSet(words);
        for (String e : s )
//            Iterator<String> it = words.iterator();
//        while (it.hasNext()){
//            String r = it.next();
            System.out.println(e);
        }
//        for (String u : word ) {
//           // String u = word.get(i);
//            System.out.println(u);
//
//        }


       // HashSet<String> set = new HashSet<String>();
//        Iterator<String> i = words.iterator();
//        while (i.hasNext()) {
//            String str = i.next();
//            System.out.println(str);

        //напишите тут ваш код


    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("knlknl");
        words.add("mpkmk");
        words.add("giyg");
        words.add("giyg");


        print(words);
    }
}


