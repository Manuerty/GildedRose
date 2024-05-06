package gildedrose;

import java.util.Arrays;
import gildedrose.Item.Item;

public class GildedRose {
    public Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(Item::updateItem);
    }
}
