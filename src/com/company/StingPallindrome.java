package com.company;

public class StingPallindrome {
    public static void main(String[] args) {
        String text = "Suraj Is my name";
        String rev ="";
        String text1 = text;
        for(int i=text.length(); i>0; i--){
            rev = rev + text.charAt(i-1);
        }
        System.out.println(rev);
        System.out.println(text);

        if(rev==text1){
            System.out.println("The string is pallindrome");
        }
        else{
            System.out.println("The string is not pallindrome");

        }
    }
}
