package org.skypro.skyshop.search;

public class SearchEngine {
    private Searchable[] searchableItems;
    private int currentIndex = 0;

    public SearchEngine(int capacity) {
        this.searchableItems = new Searchable[capacity];
    }

    public void add(Searchable item) {
        if (currentIndex < searchableItems.length) {
            searchableItems[currentIndex] = item;
            currentIndex++;
        }
    }

    public Searchable[] search(String query) {
        Searchable[] results = new Searchable[5];
        int resultIndex = 0;

        for (Searchable item : searchableItems) {
            if (item != null && item.getSearchTerm().toLowerCase().contains(query.toLowerCase())) {
                if (resultIndex < 5) {
                    results[resultIndex] = item;
                    resultIndex++;
                } else {
                    break;
                }
            }
        }

        return results;
    }
}