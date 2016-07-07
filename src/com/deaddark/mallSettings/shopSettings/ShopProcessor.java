package com.deaddark.mallSettings.shopSettings;

import com.deaddark.mallSettings.BaseMall;
import com.deaddark.mallSettings.shopSettings.goodsSettings.BaseGood;

import static java.lang.Math.*;

/**
 * Created by Ilya on 05.07.2016.
 */
public class ShopProcessor {            // Класс для произведения действий над магазинами и их товарами
    public static void  printShopGoods(int shopID){
        final BaseShop baseShop = BaseMall.shops.get(shopID);
        System.out.println("Shop n"+(shopID+1));
        for (int i=0;i<baseShop.baseGoodQ-baseShop.getGoodQ();i++) {    //Перебираем количество имеющегося товара
            final BaseGood baseGood =baseShop.list.get(i);    // Создаём ссылку на вызываемый из списка товар
            System.out.format(baseGood.getName()+" price:"+"%.2f%n",baseGood.getPrice());   //Вывод имени, номера и цены товара

        }
    }

}
