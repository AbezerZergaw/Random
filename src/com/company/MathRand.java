package com.company;

import java.util.Random;

public class MathRand {


    public static void main(String[] args) {
        rand();

    }


    public static void rand(){
        int count=0;
        Random rand = new Random();
        while(count !=5){


            int secretNum = rand.nextInt(70)+1;
            System.out.println(secretNum);
            count++;
        }
        int secretNum = rand.nextInt(25)+1;
        System.out.println("Power ball number "+secretNum);

    }


}
