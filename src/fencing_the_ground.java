import java.util.Scanner;
public class fencing_the_ground {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float length = in.nextFloat();
        float breadth = in.nextFloat();

        double perimeter = 2*(length+breadth);
        double area = length*breadth;

        int p = (int)perimeter;
        int a = (int)area;

        System.out.println("The required length is " + p + " m");
        System.out.println("The required area of carpet is " + a + " sqm");

    }
}

