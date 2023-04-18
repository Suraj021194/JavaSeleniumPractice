package com.company;

import java.util.Arrays;

public class WordsReverse {
    public static void main(String[] args) {
        String sc = "Java is Object oriented Programming Language";

        System.out.println(sc);

        String[] text = sc.split("\\s");


        String text1 ="";

        for(int i=text.length-1; i>=0; i--){
            text1 = text[i];
            System.out.print(" " + text1);
        }

    }
}
