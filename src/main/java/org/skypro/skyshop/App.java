package org.skypro.skyshop;

import org.skypro.skyshop.product.*;
import org.skypro.skyshop.search.SearchEngine;
import org.skypro.skyshop.search.Searchable;

public class App {
    public static void main(String[] args) {
        SearchEngine engine = new SearchEngine(10);

        Product simple = new SimpleProduct("Книга", 500);
        Product discounted = new DiscountedProduct("Футболка", 2000, 25);
        Product fix = new FixPriceProduct("Подарочный набор");

        Article article1 = new Article("Как выбрать книгу", "Выбирайте книги по жанру и автору.");
        Article article2 = new Article("Уход за одеждой", "Стирайте футболки при 30 градусах.");

        engine.add(simple);
        engine.add(discounted);
        engine.add(fix);
        engine.add(article1);
        engine.add(article2);

        System.out.println("Поиск по строкам\n");

        testSearch(engine, "книга");
        testSearch(engine, "книгу");
        testSearch(engine, "футболка");
        testSearch(engine, "одежда");
        testSearch(engine, "подарок");
        testSearch(engine, "не существует");
    }

    private static void testSearch(SearchEngine engine, String query) {
        System.out.println("Поиск: \"" + query + "\"");
        Searchable[] results = engine.search(query);
        for (Searchable item : results) {
            if (item != null) {
                System.out.println("  -> " + item.getName() + " (" + item.getContentType() + ")");
            }
        }
        System.out.println();
    }
}