package com.deaddark.mallSettings.shopSettings;



import com.deaddark.mallSettings.BaseMall;
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
            "JEWELRY_SHOP"};
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

    public int getBaseGoodQ() {
        return baseGoodQ;
    }

    private int baseGoodQ;
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
    //public static void  printShopGoods(int shopID){
     //   final BaseShop baseShop = BaseMall.shops.get(shopID);
     //   System.out.println("Shop n"+(shopID+1));
     //   for (int i=0;i<baseShop.baseGoodQ-baseShop.getGoodQ();i++) {    //Перебираем количество имеющегося товара
     //       final BaseGood baseGood =baseShop.list.get(i);    // Создаём ссылку на вызываемый из списка товар
     //       System.out.format(baseGood.getName()+" price:"+"%.2f%n",baseGood.getPrice());   //Вывод имени, номера и цены товара

        }


