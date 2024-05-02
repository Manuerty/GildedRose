package gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import gildedrose.Item.Item;
import gildedrose.Item.NormalItem;

public class GildedRoseTest {
    @Test
    void foo() {
        Item[] items = new NormalItem[] { new NormalItem("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
}
