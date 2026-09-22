
// get the character and prints its ascii value
import java.util.Scanner;
public class ASCII {
    public static void main(String[] args) {
        System.out.println("Enter a character: ");
        // 1. Correctly initialize the Scanner with System.in
        Scanner input = new Scanner(System.in);
        // 2. Use the 'input' object variable to read the character
        char c = input.next().charAt(0);
        // 3. Cast the character to an int to get and print its ASCII value
        int ascii = (int)c;
        System.out.println("The ASCII value of '" + c + "' is: " + ascii);
        // 4. Close the scanner resource
        input.close();
    }
}
// we can typecast like this also
// char c = input.next().charAt(0);
//
//System.out.println("ASCII value: " )

