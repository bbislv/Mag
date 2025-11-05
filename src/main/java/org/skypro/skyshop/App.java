package org.skypro.skyshop;

import org.skypro.skyshop.product.Product;
import org.skypro.skyshop.basket.ProductBasket;

public class App {
    public static void main(String[] args) {
        Product product1 = new Product("Ноутбук", 50000);
        Product product2 = new Product("Мышь", 1000);
        Product product3 = new Product("Клавиатура", 2500);
        Product product4 = new Product("Монитор", 15000);
        Product product5 = new Product("Наушники", 3000);
        Product product6 = new Product("Геймпад", 2000);

        ProductBasket basket = new ProductBasket();

        System.out.println("1. Добавление продукта в корзину");
        basket.addProduct(product1);
        basket.printBasket();

        System.out.println("\n2. Добавление продукта в заполненную корзину");
        basket.addProduct(product2);
        basket.addProduct(product3);
        basket.addProduct(product4);
        basket.addProduct(product5);
        basket.addProduct(product6);

        System.out.println("\n3. Печать содержимого корзины с несколькими товарами");
        basket.printBasket();

        System.out.println("\n4. Получение стоимости корзины");
        System.out.println("Общая стоимость: " + basket.getTotalPrice());

        System.out.println("\n5. Поиск товара, который есть в корзине");
        System.out.println("Есть ли 'Ноутбук'? " + basket.containsProduct("Ноутбук"));

        System.out.println("\n6. Поиск товара, которого нет в корзине");
        System.out.println("Есть ли 'Геймпад'? " + basket.containsProduct("Геймпад"));

        System.out.println("\n7. Очистка корзины");
        basket.clearBasket();
        basket.printBasket();

        System.out.println("\n8. Печать содержимого пустой корзины");
        basket.printBasket();

        System.out.println("\n9. Получение стоимости пустой корзины");
        System.out.println("Общая стоимость пустой корзины: " + basket.getTotalPrice());

        System.out.println("\n10. Поиск товара по имени в пустой корзине");
        System.out.println("Есть ли 'Ноутбук' в пустой корзине? " + basket.containsProduct("Ноутбук"));
    }
}