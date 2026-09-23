import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i =0; i<n; i++){
            a[i] = in.nextInt();
        }
        int rev[] = new int[n];
        int j =0;
        for(int i=n-1; i>=0; i--){
            rev[j] = a[1];
            j++;
        }
        for(int i =0; i<n; i++){
            System.out.println(rev[j] + " ");
        }
    }
}
