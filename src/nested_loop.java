//print prime no. in the range nested for loop
import java.util.Scanner;
public class nested_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for(int i=1; i<=num; i++) {
            for(int j=1; j<=num/2; j++) {
                if(num%j==0) {
                    System.out.println("numbers: "+num);
                }
            }
            System.out.println(" "+num);
        }

    }
}