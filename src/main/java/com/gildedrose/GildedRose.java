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
            boolean exception = Arrays.asList(specialItems).contains(items[i].name);
            if(!exception && items[i].quality > 0) {
                    decrementQuality(i);
            } else {
                if (items[i].quality < MAX_QUALITY) {
                    incrementQuality(i);

                    if (items[i].name.equals(BACKSTAGE_PASSES)) {
                        if (items[i].sellIn < 11) {
                            incrementQuality(i);
                        }

                        if (items[i].sellIn < 6) {
                            incrementQuality(i);
                        }
                    }
                    if(items[i].quality > MAX_QUALITY){
                        items[i].quality = MAX_QUALITY;
                    }
                }
            }

            if (!items[i].name.equals(SULFURAS)) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                /* GC: The nested logic before else is equal to  item not an exception AND
            quality > 0. We can replace with
            if(!exception && items[i].quality > 0)
             */
                if (!items[i].name.equals(AGED_BRIE)) {
                    if (!items[i].name.equals(BACKSTAGE_PASSES)) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals(SULFURAS)) {
                                decrementQuality(i);
                            }
                        }
                    }
                    else {
                        items[i].quality = 0;
                    }
                } else {
                    if (items[i].quality < MAX_QUALITY) {
                        incrementQuality(i);
                    }
                }
            }
        }
    }

    private void incrementQuality(int i) {
        items[i].quality = items[i].quality + 1;
    }

    private void decrementQuality(int i) {
        items[i].quality = items[i].quality - 1;
    }
}
