package com.company;

public abstract class Human {
    public String firstName;
    public String lastName;
    public String nickname;
    public String country;

    public void sayMyName(){

        Systems.printing(firstName+"'"+nickname+"'"+lastName);

}
}
