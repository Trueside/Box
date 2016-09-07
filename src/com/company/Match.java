package com.company;

import javax.swing.*;

public class Match {

    Boxer[] mass = new Boxer[2];

    public void createMetch(Boxer boxer1, Boxer boxer2){

        mass[0] = boxer1;
        mass[1] = boxer2;
        Systems.printing(boxer1.nickname+" VS "+ boxer2.nickname);
    }

    public void startFight(){
        int x = Systems.randomBones();
        int y = Systems.randomBones();
    }
}
