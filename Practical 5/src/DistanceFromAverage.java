import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double QUIT = 99999;
        double[] numList = new double[20];
        double userInput, total = 0;
        int x = 0;
        System.out.println("Please enter a number or 99999 to quit: ");
        userInput = input.nextDouble();
        while (userInput != QUIT && x < numList.length) {
            numList[x] = userInput;
            total += numList[x];
            ++x;
            System.out.println("Please enter another number:");
            userInput = input.nextDouble();
        }
        if (x == 0) {
            System.out.println("You did not enter anynumber.");
        } else {
            double average = total / x;
            System.out.println("The average of the number you inputed is: " + average);
            for (int y = 0; y < x; ++y) {
                double distance = numList[y] - average;
                System.out.println("The distance of this number from average is: " + distance);
            }
            System.exit(0);
        }
    }
}

