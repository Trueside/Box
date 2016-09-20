package com.company;

public class Match {

    Boxer[] mass = new Boxer[2];

    public void createMetch(Boxer boxer1, Boxer boxer2){

        mass[0] = boxer1;
        mass[1] = boxer2;
        Systems.printing(boxer1.nickname+" VS "+ boxer2.nickname);
    }

    public void startFight(Boxer boxer1, Boxer boxer2) throws InterruptedException {
        TransportObject.getNumBones();
        do {
            int dice1 = Systems.randomBones();
            int dice2 = Systems.randomBones();
            Systems.printing(dice1+"  "+dice2);

            if (dice1 <3 && dice2 <3){
                Systems.printing("Бойцы замахиваются...");
                if (dice1 < dice2){
                    Systems.printing(boxer2.nickname+" попадает!");
                    boxer1.health -=2;
                }
                if (dice1 > dice2){
                    Systems.printing(boxer1.nickname+" попадает!");
                    boxer2.health -=2;
                }
                if (dice1==dice2){Systems.printing("... и оба промахиваются");}
            }
            if (dice1 >2 && dice1 <5 && dice2 >2 && dice2 <5){
                Systems.printing("Клинч!");
                if (dice1 > dice2){
                    boxer1.stamina +=2;
                    boxer2.stamina +=1;
                }
                if (dice1 < dice2){
                    boxer1.stamina +=1;
                    boxer2.stamina +=2;
                }
            }
            if (dice1 >4 && dice2 >4){
                Systems.printing("Ничего не происходит.");
            }
            if ((dice1 <3 && dice2 >2 && dice2 <5) || (dice2 <3 && dice1 >2 && dice1 <5)){
                if (dice1 <3){
                    Systems.printing(boxer2.nickname+" блокирует удар "+boxer1.nickname+"!");
                    boxer1.stamina -=1;
                }
                if (dice2 <3){
                    Systems.printing(boxer1.nickname+" блокирует удар "+boxer2.nickname+"!");
                    boxer2.stamina -=1;
                }
            }
            if ((dice1 >2 && dice1 <5 && dice2 >4) || (dice2 >2 && dice2 <5 && dice1 >4)){
                if (dice2 >4){
                    Systems.printing(boxer1.nickname+" зажимается в угол.");
                    boxer1.stamina -=1;
                }
                if (dice1 >4){
                    Systems.printing(boxer2.nickname+" зажимается в угол.");
                    boxer2.stamina -=1;
                }
            }
            if ((dice1 <3 && dice2 >4) || (dice2 <3 && dice1 >4)){
                if (dice1 <3){
                    Systems.printing(boxer2.nickname+" пропускает удар в голову!");
                    boxer2.health -=1;
                }
                if (dice2 <3){
                    Systems.printing(boxer1.nickname+" пропускает удар в голову!");
                    boxer1.health -=1;
                }
            }
            Thread.sleep(100);
        }
        while ((boxer1.health > 0 && boxer2.health > 0));
        if (boxer1.health < 1){
            Systems.printing("Победил "+boxer2.nickname);
        }
        if (boxer2.health < 1){
            Systems.printing("Победил "+boxer1.nickname);
        }
    }
}
