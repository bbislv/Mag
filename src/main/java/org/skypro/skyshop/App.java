package org.skypro.skyshop;

import org.skypro.skyshop.product.*;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product simple1 = new SimpleProduct("Книга", 500);
        Product discounted1 = new DiscountedProduct("Смартфон", 50000, 10);
        Product discounted2 = new DiscountedProduct("Наушники", 3000, 50);
        Product fix1 = new FixPriceProduct("Подарочный сертификат");
        Product fix2 = new FixPriceProduct("Бонусный набор");
        ProductBasket basket = new ProductBasket();

        basket.addProduct(simple1);
        basket.addProduct(discounted1);
        basket.addProduct(discounted2);
        basket.addProduct(fix1);
        basket.addProduct(fix2);
        basket.printBasket();
    }
}