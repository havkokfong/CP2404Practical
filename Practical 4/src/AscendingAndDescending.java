import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescending {
    public static void main(String[] args){
        System.out.println("Please enter three number:");
        Scanner input = new Scanner(System.in);
        int value1 = input.nextInt();
        int value2 = input.nextInt();
        int value3 = input.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(value1);
        list.add(value2);
        list.add(value3);

        Collections.sort(list);
        System.out.println("Ascending order:");
        for (int i : list){
            System.out.println(i);
        }

        Collections.reverse(list);
        System.out.println("Descending order:");
        for (int i : list){
            System.out.println(i);
        }
    }
}
