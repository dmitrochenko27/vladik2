package org.example;
import java.util.Collections;
import java.util.HashSet;

public class jhhkj {

    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] array) {
        HashSet<String> hashSet = new HashSet<>();
        Collections.addAll(hashSet, array);

        //напишите тут ваш код
        return hashSet;
    }
}


