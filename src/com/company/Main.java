package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNum = (int) (Math.random() * 100);
        System.out.println(secretNum);
        int chance = 0;
        System.out.println("Guess any  number from 1 to 10 : ");
        while (chance < 3) {
            System.out.println("You entered :" );
            int num = sc.nextInt();
            if (num == secretNum) {
               System.out.println("You got the correct number :" + num);
               System.out.println("Play again");
            } else
              System.out.println("You are wrong. Try again");
            chance++;


        }





    }
}
