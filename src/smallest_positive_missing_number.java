import java.io.*;
import java.util.*;
public class smallest_positive_missing_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];

        for (int m = 0; m < n; m++) {
            a[m] = in.nextInt();
        }
        int c=1; //we cannot take c=0 bcz 0 is not positive thats why c=1
        for(int i=0; i<n; i++){
            if(a[i]<c){
                continue;
            }
            else if(a[i]==c){
                c++;
            }
            else if(a[i]>c){
                System.out.println("Missing value: " + c);
                return;

            }
        }
        System.out.print("Missing value: "+c);
    }
}
