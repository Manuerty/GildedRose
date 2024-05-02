package gildedrose.Item;


public class NormalItem extends Item{
    public NormalItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }
    public void updateItem() {
        updateQuality();
        updateSellIn();
    }
    @Override
    public void updateQuality(){
        if (sellIn >0 && checkQuality()){
            --quality;
            return;
        }
        quality = Math.max(quality - 2, 0);
    }

    @Override
    public void updateSellIn(){
        --sellIn;
    }

    private boolean checkQuality(){
        return quality < 50 && quality > 0;
    }
}
