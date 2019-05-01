import java.util.ArrayList;
import java.util.Scanner;

public class TwelveInts {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> intList = new ArrayList<>();
        int position = 1;
        for (int range = 0; range <= 11; range ++){
            System.out.println("Please input your " + position + " digit: ");
            int num = input.nextInt();
            intList.add(num);
            position += 1;
        }
        System.out.println("\n You have entered the following number: ");
        for (int i = 0; i < intList.size(); i++){
            System.out.println(intList.get(i));
        }
        int backRange = 11;
        System.out.println("\n The number you have entered display backward: ");
        for (int j = 11; j >= 0; j -= 1) {
            System.out.println(intList.get(backRange));
            backRange -= 1;
        }
    }
}
