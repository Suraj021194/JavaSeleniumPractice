package com.company;

public class StingPallindrome {
    public static void main(String[] args) {
        String text = "Suraj Is my name";
        String rev ="";
        for(int i=text.length(); i>0; i--){
            rev = rev + text.charAt(i-1);
        }
        System.out.println(rev);
        System.out.println(text);
    }
}
