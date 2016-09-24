package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final int MAX_QUALITY = 50;
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public String[] specialItems = {AGED_BRIE, BACKSTAGE_PASSES, SULFURAS};
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {

        for (int i = 0; i < items.length; i++) {
            /* Check if item is in the list of exceptions */
            boolean exception = Arrays.asList(specialItems).contains(items[i].name);

            /* Update  quality for current items. Backstage depends on sellIn value. Conjured items degrade twice as quickly.  */
            if (!exception) {
                decrementQuality(i);
                if(items[i].name.toLowerCase().contains("conjured")){
                    decrementQuality(i);
                }
            } else {
                incrementQuality(i);
                if (items[i].name.equals(BACKSTAGE_PASSES)) {
                    if (items[i].sellIn < 11) { incrementQuality(i); }
                    if (items[i].sellIn < 6)  { incrementQuality(i); }
                }
            }

            decrementDays(items[i]);

            /* Update quality for old items. Backstage, Aged Brie and Sulfuras are exceptions */
            if (items[i].sellIn < 0) {
                if (!exception) { decrementQuality(i); }
                if (items[i].name.equals(BACKSTAGE_PASSES)) { items[i].quality = 0; }
                if (items[i].name.equals(AGED_BRIE)) { incrementQuality(i); }

            }
            
            /* Check for poorly created Items */
            if(items[i].name.equals(SULFURAS)) {items[i].quality = 80;}
            if (items[i].quality < 0) {items[i].quality = 0;}

        }
    }

    /* ---------------------   Private methods    ----------------------------- */
    private void decrementDays(Item item) {
        if (!item.name.equals(SULFURAS)) { item.sellIn--; }
    }

    private void incrementQuality(int i) {
        if (items[i].quality < MAX_QUALITY) { items[i].quality++; }
    }

    private void decrementQuality(int i) {
        if (items[i].quality > 0) { items[i].quality--; }
    }
}

