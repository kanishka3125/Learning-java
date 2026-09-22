import java.io.*;
import java.util.*;

public class dollar_and_cent {
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int d1 = in.nextInt();
            int c1 = in.nextInt();
            int d2 = in.nextInt();
            int c2 = in.nextInt();

            int sod = d1+d2;
            int cod = c1+c2;
            int remainingCent = cod %100;
            int dollar = d1+d2+(cod/100);


            System.out.println(dollar);
            System.out.println(remainingCent);

    }
}
