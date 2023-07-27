package org.example;

public class PhoneApp {
    SmartPhone sp1 = new SmartPhone(1,"Samsung",10000,"12345",9.8F,8.0F,12F);
    SmartPhone sp2 = new SmartPhone(2,"Iphone",16000,"12344",10F,6.0F,12.5F);
    SmartPhone sp3 = new SmartPhone(3,"Ericson",12000,"12343",13.5F,8.0F,20F);
    SmartPhone sp4 = new SmartPhone(4,"Huawei",12500,"12342",10F,7.5F,22F);
    SmartPhone sp5 = new SmartPhone(5,"Xiamoi",9000,"12345",9.8F,8.0F,12);

    SmartPhone phoneArr[] = new SmartPhone[]{sp1, sp2, sp3, sp4, sp5};

    public double calculateTotalPrice(SmartPhone[] smartPhoneArray){
    double totalPrice = 0.0F;//create a total price variable
        for (SmartPhone phone : smartPhoneArray) {
            totalPrice+=phone.price;//add each phone price to the total price
        }
        return totalPrice;//return the total price
    }

}
