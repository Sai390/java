package com.ivycomptech.problems.com.ivycomptech;

import java.util.Scanner;

public class Random {

        public static void main(String[] args) {
            Scanner b = new Scanner(System.in);
            int  num ;
            num=b.nextInt();
            int a;
            a = b.nextInt();

            do {
                System.out.println(num);


                if (a > num) {
                    System.out.println("Too high, try again.");
                } else if(a<num){
                    System.out.println("Too low, try again.");
                }
                else{
                    System.out.println("You got it");
                }
            } while (a== num);
        }
    }
