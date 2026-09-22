import java.util.Scanner;
public class higher_lower_order {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float num = in.nextFloat();
        System.out.println(Math.floor(num));
        System.out.println((int)Math.floor(num));
        System.out.println(Math.ceil(num));
        System.out.println((int)Math.ceil(num));
        in.close();

    }
}
