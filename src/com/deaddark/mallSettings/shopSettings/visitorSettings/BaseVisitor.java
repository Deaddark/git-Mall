package com.deaddark.mallSettings.shopSettings.visitorSettings;

import com.deaddark.mallSettings.BaseMall;
import com.deaddark.mallSettings.shopSettings.BaseShop;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import static com.deaddark.mallSettings.BaseMall.shops;

/**
 * Created by Ilya on 07.07.2016.
 */
public class BaseVisitor {
    String userType;
    float walletMoney;
    float bankMoney;
    int shopID;

    public BaseVisitor(String userType) {
        this.userType=userType;
        walletMoney = ((float)((Math.random()*10000)));
        bankMoney = ((float)(Math.random()*1000000));
    }
    public void selectShop(BaseMall baseMall){         // Выбор магазина для похода в него
        Scanner scanner =new Scanner(System.in);   // Создание экземпляра класса Сканнер для Ввода Номера магазина
        if (userType=="HUMAN"&userType=="HUMAN-ADMIN"){      // Проверка типа доступа человека
            shopID=scanner.nextInt();        // Ввод номера магазина

        }}
    public  void walkToShop(BaseShop shop){
        BaseShop baseShop = BaseMall.shops.get(shopID);


    }
}
