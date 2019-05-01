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
        mChar = Character.toLowerCase(mChar);
        System.out.println("After toLowerCare(), mChar is " + mChar);
        mChar = Character.toUpperCase(mChar);
        System.out.println("After toUpperCare(), mChar is " + mChar);
        if (Character.isLetterOrDigit(mChar))
            System.out.println(mChar + " is a letter or digit");
        else
           System.out.println(mChar + " is neither a letter nor a digit");
        if (Character.isWhitespace(mChar))
            System.out.println(mChar + " is whitespace");
        else
            System.out.println(mChar + " is not whitespace");
        }
    }

