import java.util.Scanner;

public class EvenOdd {


    public static void main(String[] agrs){
        System.out.println("Please enter your number:");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        if (value % 2 == 0){
            System.out.println("This number is Even.");
        }
        else {
            System.out.println("This number is Odd.");
        }
    }
}
