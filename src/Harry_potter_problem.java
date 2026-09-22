import java.io.*;
import java.util.*;

public class Harry_potter_problem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        n = Math.abs(n);
        int first_digit = n/1000;
        int last_digit = n%10;

        int a = first_digit + last_digit;

        System.out.println(a);


    }
}

