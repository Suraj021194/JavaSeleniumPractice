package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
         int  n = sc.nextInt();

         int flag = 0;

         for(int i = 2; i<=n/2; i++){
             if(n%i == 0){    //  8
                 flag = 1;
                 break;
             }
         }

        if(flag == 1){
            System.out.println(n + " is not a prime number");
        }
        else{
            System.out.println(n + " is  a prime number");
        }

    }
}
