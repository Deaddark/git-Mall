package com.deaddark.mallSettings;

import com.deaddark.mallSettings.shopSettings.BaseShop;

import java.util.ArrayList;

/**
 * Created by Ilya on 05.07.2016.
 */
public class BaseMall {
    int mallSize;
    public static ArrayList<BaseShop> shops = new ArrayList<>();
public  BaseMall(int mallSize){

    for (int i=0;i<mallSize;i++) {
        shops.add(new BaseShop());
    }
}
}
