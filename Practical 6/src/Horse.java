import java.util.Scanner;

public class Horse {
    public static void main(String[] args){

    }

    public void houseName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the name of the house: ");
        String name = input.next();
        System.out.println("Your house name is: " + name);
    }

    public void houseColour(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the colour of the house: ");
        String color = input.next();
        System.out.println("Your house colour is: " + color);
    }

    public void houseBirth(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the birth year: ");
        int birth_year = input.nextInt();
        System.out.println("Your house birth year: " + birth_year);
    }
}

