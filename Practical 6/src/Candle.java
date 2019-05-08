import java.util.Scanner;

public class Candle {
    String color;
    double height;
    double price;
    Scanner input;

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public double getheight(){
        return height;
    }

    public void setColor(String choice){
        color = choice;
    }

    public void setHeight(double select){
        final double price_per_inch = 2.0;
        height = select;
        price = select * price_per_inch;
    }
}
