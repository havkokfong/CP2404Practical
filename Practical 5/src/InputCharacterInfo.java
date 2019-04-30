import java.util.Scanner;

public class InputCharacterInfo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        String userinput = input.next();
        char mChar = userinput.charAt(0);
        if (Character.isUpperCase(mChar))
            System.out.println(mChar + " is uppercase");
        else
            System.out.println(mChar + " is not uppercase");
        if (Character.isLowerCase(mChar))
            System.out.println(mChar + " is Lowercase");
        else
            System.out.println(mChar + " is not lowercase");
        }
    }

