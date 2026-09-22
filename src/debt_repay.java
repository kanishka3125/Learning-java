import java.io.*;
import java.util.*;

public class debt_repay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float p = in.nextFloat();
        float r = in.nextFloat();
        float t = in.nextFloat();

        double si = (p*r*t)/100;
        double ta = p+si;
        double dp = si*0.02;
        double a = ta-dp;

        System.out.printf("%.2f\n", si);
        System.out.printf("%.2f\n", ta);
        System.out.printf("%.2f\n", dp);
        System.out.printf("%.2f\n", a);

    }


}

