package com.company;

import javax.swing.*;

public class Match {

    int bone1;
    int bone2;

    Boxer[] mass = new Boxer[2];

    public void createMetch(Boxer boxer1, Boxer boxer2){

        mass[0] = boxer1;
        mass[1] = boxer2;
        Systems.printing(boxer1.nickname+" VS "+ boxer2.nickname);
    }

    public String startFight(Boxer boxer1, Boxer boxer2) throws InterruptedException {
        TransportObject.getNumBones();
        do {
            bone1 = Systems.randomBones();
            bone2 = Systems.randomBones();

            if (bone1<3 && bone2<3){
                Systems.printing("Бойцы замахиваются...");
                if (bone1<bone2){
                    Systems.printing(boxer2.nickname+" попадает!");
                    boxer1.health -=2;
                }
                if (bone1>bone2){
                    Systems.printing(boxer1.nickname+" попадает!");
                    boxer2.health -=2;
                } else {Systems.printing("...в молоко.");}
            }
            if (bone1>2 && bone1<5 && bone2>2 && bone2<5){
                Systems.printing("Клинч!");
                if (bone1>bone2){
                    boxer1.stamina +=2;
                    boxer2.stamina +=1;
                }
                if (bone1<bone2){
                    boxer1.stamina +=1;
                    boxer2.stamina +=2;
                } else {Systems.printing("Брейк!");}
            }
            if (bone1>4 && bone2>4){
                Systems.printing("Ничего не происходит.");
            }
            if ((bone1<3 && bone2>2 && bone2<5) || (bone2<3 && bone1>2 && bone1<5)){
                if (bone1<3){
                    Systems.printing(boxer2.nickname+" блокирует удар "+boxer1.nickname+"!");
                    boxer1.stamina -=1;
                }
                if (bone2<3){
                    Systems.printing(boxer1.nickname+" блокирует удар "+boxer2.nickname+"!");
                    boxer2.stamina -=1;
                }
            }
            if ((bone1>2 && bone1<5 && bone2>5) || (bone2>2 && bone2<5 && bone1>5)){
                if (bone1<3){
                    Systems.printing(boxer1.nickname+" зажимается в угол.");
                    boxer1.stamina -=1;
                }
                if (bone2<3){
                    Systems.printing(boxer2.nickname+" зажимается в угол.");
                    boxer2.stamina -=1;
                }
            }
            if ((bone1<3 && bone2>5) || (bone2<3 && bone1>5)){
                if (bone1<3){
                    Systems.printing(boxer2.nickname+" пропускает удар в голову!");
                    boxer2.health -=1;
                }
                if (bone2<3){
                    Systems.printing(boxer1.nickname+" пропускает удар в голову!");
                    boxer1.health -=1;
                }
            }
            Thread.sleep(1000);
        }
        while (boxer1.health != 0 || boxer2.health != 0);
        if (boxer1.health == 0){
            return boxer1.nickname;
        } else {return boxer2.nickname;}
    }
}
