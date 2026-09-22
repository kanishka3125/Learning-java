import java.util.Scanner;
public class prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if(n<=1) {
            System.out.println("Unit");
            return;
        }
        for (int i=2; i<=n/2; i++) {
            if(n%i==0) {
                System.out.println("np");
                return;
            }

        }
        System.out.println("p");
    }
}
