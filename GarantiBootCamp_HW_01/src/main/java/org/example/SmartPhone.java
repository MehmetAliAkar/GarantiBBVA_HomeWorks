package org.example;

public class SmartPhone extends Phone{
    float storage;
    float ram;
    float camera;
// no args constructor
    public SmartPhone(){

    }
// all args constructor
    public SmartPhone(int id,String name, int price,String phoneNumber, float storage, float ram, float camera){
        this.id = id;
        this.name = name;
        this.price=price;
        this.phoneNumber=phoneNumber;
        this.storage = storage;
        this.ram = ram;
        this.camera = camera;
    }

}
