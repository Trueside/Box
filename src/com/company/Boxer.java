package com.company;

public class Boxer extends Human {

    public int rang;

    public String handsPosition;
    public int power;
    public int health;
    public int stamina;
    public int blockSkill;

    public Boxer(){

        Systems.printing("Say your firstname!");
        this.firstName = Systems.scaning();
        Systems.printing("Say your lastname!");
        this.lastName = Systems.scaning();
        Systems.printing("Say your nickname!");
        this.nickname = Systems.scaning();
        Systems.printing("Say your country!");
        this.country = Systems.scaning();
        Systems.printing("Your hand position is... !");
        this.handsPosition = Systems.scaning();
        Systems.printing("Your power is...");
        this.power = Integer.parseInt(Systems.scaning());
        Systems.printing("Your health is...");
        this.health = Integer.parseInt(Systems.scaning());
        Systems.printing("Your stamina is...");
        this.stamina = Integer.parseInt(Systems.scaning());
        Systems.printing("Your block skill is...");
        this.blockSkill = Integer.parseInt(Systems.scaning());
        Systems.printing("Well done, son!");

    }

}
