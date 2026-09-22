import java.util.Scanner;
public class prime_numbers_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = 1;

        for(int i=2; i<=n; i++){
            t=1;
            for(int j=2; j<=i/2;){
                if(i%j==0){
                    t=0;
                }

            }
        }



    }

}
