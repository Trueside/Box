package com.company;

import java.util.Random;
import java.util.Scanner;

public class Systems {

    public static void printing(Object object){
        System.out.println(object);
    }

    public static String scaning(){
        Scanner scan = new Scanner(System.in);
        String i = scan.nextLine();
        return i;
    }

    public static int randomBones(){
        Random random = new Random();
        int number = (random.nextInt(6)+1);
        return number;
    }
}
