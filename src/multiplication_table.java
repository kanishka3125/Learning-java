import java.util.Scanner;
public class multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1;i<=12; i++) {
            System.out.println(n + "*" + i + "=" + (n*i));

        }

    }
}
