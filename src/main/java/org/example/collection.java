package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collection {
    public static void main(String[] args) {
        List<String> fake = Collections.nCopies(5, "Привет");

       // ArrayList<String> list = new ArrayList<String>(fake);

        for(String s: fake)
            System.out.println(s);
    }
}
