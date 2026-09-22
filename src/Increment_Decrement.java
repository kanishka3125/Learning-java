import java.util.Scanner;
public class Increment_Decrement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        a = (a++)+(++a)+(a--)+(a++);
        System.out.println(a);

    }
}
