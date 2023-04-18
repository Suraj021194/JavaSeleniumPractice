package com.company;

import java.util.Scanner;

public class PallindromeNumber {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Enter the three digit number/n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rev = 0;
        int num = n;
        while (n != 0) {
            int digit = n % 10;    //4, 3
            rev = rev*10 + digit;   //rev = 4, ,
            n = n / 10;  // n= 23
        }
        System.out.println(rev);
        System.out.println(num);


        if(rev==num){
            System.out.println(num +  "  Is pallindrome number");
        }
        else{
            System.out.println(num + "  Is not pallindrome number");
        }
    }
}

