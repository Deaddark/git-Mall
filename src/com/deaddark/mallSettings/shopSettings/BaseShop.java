package com.deaddark.mallSettings.shopSettings;



import com.deaddark.mallSettings.shopSettings.goodsSettings.BaseGood;

import java.util.ArrayList;

/**
 * Created by Ilya on 05.07.2016.
 */
public class BaseShop {
<<<<<<< HEAD
    private String typeList[]={  "CLOTHIER_SHOP",
            "COMPUTER_SHOP",
            "FOOD_SHOP",
            "JEWELRY_SHOP",};
    private String type;
    ArrayList<BaseGood> list = new ArrayList<>();

     int getGoodQ() {
        return goodQ;
    }
=======
    String typeList[]={  "CLOTHIER_SHOP",
            "COMPUTER_SHOP",
            "FOOD_SHOP",
            "JEWELRY_SHOP",};
    String type;
    ArrayList<BaseGood> list = new ArrayList<BaseGood>();
>>>>>>> fe51d6c... Initial commit

    private int goodQ;
    int baseGoodQ;
    public void sellG(){                                // Каждый магазин может продать

    }
<<<<<<< HEAD
     void buyG(){                                 //Каждый магазин может купить
        for (int i=0;i<baseGoodQ-goodQ;i++){
        list.add(new BaseGood(type));
            goodQ++;
=======
    public void buyG(){                                 //Каждый магазин может купить
        for (int i=0;i<baseGoodQ-goodQ;i++){
        list.add(new BaseGood(type));
>>>>>>> fe51d6c... Initial commit
        }
    }

    public BaseShop() {
        type=typeList[(int)(Math.random()*4)];   //Инициализируеи тип магазина
        baseGoodQ= (int)(Math.random()*50);      //Инициализируем базовое число товаров
        buyG();
    }
}
