package com.deaddark.mallSettings.shopSettings;

import com.deaddark.mallSettings.BaseMall;
import com.deaddark.mallSettings.shopSettings.goodsSettings.BaseGood;

import static java.lang.Math.*;

/**
 * Created by Ilya on 05.07.2016.
 */
public class ShopProcessor {
    String shopType;
    void shopInit(){

    }
    public static void  printShopGoods(int shopID){
        final BaseShop baseShop = BaseMall.shops.get(shopID);
        System.out.println("Shop n"+(shopID+1));
        for (int i=0;i<baseShop.baseGoodQ;i++) {
            final BaseGood baseGood =baseShop.list.get(i);
            System.out.format(baseGood.getName()+" price:"+"%.2f%n",baseGood.getPrice());

        }
    }

}
