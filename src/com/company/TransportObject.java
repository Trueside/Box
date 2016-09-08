package com.company;

public class TransportObject {
    int bone1;
    int bone2;

    public static TransportObject getNumBones(){
        TransportObject transportObject = new TransportObject();
        transportObject.bone1 = Systems.randomBones();
        transportObject.bone2 = Systems.randomBones();
        return transportObject;
    }
}