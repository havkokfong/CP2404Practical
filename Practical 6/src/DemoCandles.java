public class DemoCandles {
    public static void main(String[] args){
        Candle candle = new Candle();
        ScentedCandle scentedCandle = new ScentedCandle();
        scentedCandle.setHeight(5);
        scentedCandle.setScent("white");
        candle.setColor("Black");
        candle.setHeight(5);
        System.out.println("The candle color is " + candle.getColor() + " with the height of " + candle.getheight()
        + " Inch and the price for this candle is " + candle.getPrice());

        System.out.println("The scent candle color is " + scentedCandle.getColor() + " with the height of " + scentedCandle.getheight()
        + " Inch and the price for scent candle is " + scentedCandle.getPrice());
    }
}
