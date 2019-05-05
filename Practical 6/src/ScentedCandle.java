public class ScentedCandle extends Candle {

    private String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String write) {
        this.scent = write;
    }

    @Override
    public void setHeight(double select) {
        final double price_per_inch = 3.0;
        super.setHeight(select);
        price = height * price_per_inch;
    }

}
