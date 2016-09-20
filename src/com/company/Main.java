package com.company;

public class Main {
    public static int i;
    public static void main(String[] args) throws InterruptedException {

        Boxer boxer1 = new Boxer("Apollo","left",5,1,10,5);
        Boxer boxer2 = new Boxer("Rocky","right",5,1,10,5);

        boxer1.sayMyName();
        boxer2.sayMyName();

        Match match1 = new Match();
        match1.createMetch(boxer1,boxer2);
        match1.startFight(boxer1,boxer2);

        boxer1.sayMyName();
        boxer2.sayMyName();
    }
}
