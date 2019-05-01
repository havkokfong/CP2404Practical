import java.util.Scanner;

public class Candle {
    String color;
    double height;
    double price;
    Scanner input;

    public static void main(String[] args) {
    }

    public void getColor() {
        System.out.println("Please enter the color you want:");
        color = input.next();
    }

    public void getheight(){
        System.out.println("Please the height of the candle:");
        height = input.nextDouble();
        price = 2.0;
        double total = height * price;
        System.out.println("The price of the candle is: " + total);
    }
}
