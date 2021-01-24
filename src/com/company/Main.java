package com.company;

public class Main {

    public static void main(String[] args) {
        String info = getInfo(21,4);
        System.out.println(info);
        info= getInfo(45,15);
        System.out.println(info);
        info= getInfo(68,29);
        System.out.println(info);
        info= getInfo(25,48);
        System.out.println(info);
        info= getInfo(55,10);
        System.out.println(info);
    }


    public static String getInfo(int age, int temperature){
        String poz="Можно идти гулять";
        String neg= "Оставайтесь дома";
        if (age>20 && age<45 && temperature>-20 && temperature< 30 ){
            return poz;
        }
         else if (age<20 && temperature>0 && temperature <28){
            return poz;
        }
        else if (age >45 && temperature >-10 && temperature <25) {
            return poz;
        }
        else {
            return neg;
        }
    }
}