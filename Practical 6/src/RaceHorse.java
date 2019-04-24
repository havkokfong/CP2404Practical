import java.util.Scanner;

public class RaceHorse extends Horse {
    public Scanner input;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    }

    public void numRace(){
        int number_of_race = 5;
        System.out.println("The number of race is:" + number_of_race);
    }

    public void getField(){
        Scanner input = new Scanner(System.in);
        String field = "Singapore area";
        System.out.println("The field is: " + field);
    }

    public void setField(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your new field: ");
        String field = input.next();
        System.out.println("Your new field is: " + field);

    }
}
