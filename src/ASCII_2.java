// get the character and prints its ascii value
import java.util.Scanner;
public class ASCII_2 {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        Scanner input = new Scanner(System.in);
        char c = input.next().charAt(0);
        int ascii = (int)c;
        System.out.println("The ASCII value of '" + c + "' is: " + ascii);

        //Close the scanner resource
        input.close();
    }
}