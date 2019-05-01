import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BabyNameComparison {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your first choice first name: ");
        String fname1 = input.next();
        System.out.println("Please enter your first choice last name: ");
        String lname1 = input.next();
        System.out.println("Please enter your second choice first name: ");
        String fname2 = input.next();
        System.out.println("Please enter your second choice last name: ");
        String lname2 = input.next();
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add(fname1);
        nameList.add(lname1);
        nameList.add(fname2);
        nameList.add(lname2);
        Random ran = new Random();
        System.out.println(nameList.get(ran.nextInt(3)) + " " + nameList.get(ran.nextInt(3)));
    }
}
