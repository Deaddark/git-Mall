package com.deaddark;

import com.deaddark.mallSettings.BaseMall;
import com.deaddark.mallSettings.shopSettings.ShopProcessor;

import java.util.ArrayList;

public class Main {
   static BaseMall mall = new  BaseMall(30);


    public static void main(String[] args) {
        ShopProcessor shopProcessor = new ShopProcessor();
        for (int i=0;i<30;i++) {
            shopProcessor.printShopGoods(i);
        }
    }}

