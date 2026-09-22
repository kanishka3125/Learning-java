import java.util.Scanner;
public class sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = a+b;
        System.out.println("Sum of '" + a + "' and '" + b + "' is: " +sum);
    }
}
