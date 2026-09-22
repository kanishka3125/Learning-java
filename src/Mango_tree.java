import java.util.Scanner;

public class Mango_tree {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int tn = in.nextInt();

        if(tn<=c || tn%c==0 || tn%c==1) {
            System.out. println("Yes");
        }
        else {
            System.out.println("No");

        }

    }
}