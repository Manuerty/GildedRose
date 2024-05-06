package gildedrose;

import gildedrose.Item.*;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Item[] items = {
            new AgedBrie("Aged Brie", 2, 0),
            new BackStagePasses("Backstage passes to a TAFKAL80ETC concert", 9, 20),
            new NormalItem("Normal Item", 5, 10),
            new Sulfuras("Sulfuras, Hand of Ragnaros", 0, 80),
            new Conjured("Conjured Mana Cake", 3, 6)
        };
        GildedRose gr = new GildedRose(items);
        for (int i = 1; i <= 11; ++i) {
            System.out.printf("----Día %d----\n", i);
            Arrays.stream(gr.items).forEach(System.out::println);
            gr.updateQuality();
        }
    }
}
