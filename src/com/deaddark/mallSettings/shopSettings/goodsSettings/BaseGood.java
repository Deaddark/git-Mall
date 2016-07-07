package com.deaddark.mallSettings.shopSettings.goodsSettings;

/**
 * Created by Ilya on 05.07.2016.
 */
public class BaseGood {
    private String foodArr[]={
            "Grocery",
            "Meat",
            "Fish",
            "Milk",
    };
    private String computerArr[]={
            "PC_HARDWARE",
    "PC_FULLS",
    "PC_PROGRAMS",
    };
    float price;
    String name;

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    String ShopType;

    public BaseGood(String shopType) {
        switch (shopType){
            case "CLOTHIER_SHOP":
            {
                name="cloth";
                price=((float)(Math.random()*1000));
                break;

            }
            case "COMPUTER_SHOP":{
                name=computerArr[((int)(Math.random()*3))];
                price=((float)(Math.random()*10000));
                break;
            }
            case "FOOD_SHOP":{
                name=foodArr[((int)(Math.random()*3))];
                price=((float)(Math.random()*500));
                break;
            }
            case "JEWELRY_SHOP":{
               name="Gem";
                price=((float)(Math.random()*100000));
                break;


            }


        }
    }
}
