package org.skypro.skyshop.product;

import org.skypro.skyshop.search.Searchable;

public class Article implements Searchable {
    private final String name;
    private final String text;

    public Article(String name, String text) {
        this.name = name;
        this.text = text;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return name + "\n" + text;
    }

    @Override
    public String getSearchTerm() {
        return getName() + " " + getText();
    }

    @Override
    public String getContentType() {
        return "ARTICLE";
    }
}