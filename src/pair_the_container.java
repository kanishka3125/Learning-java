import java.io.*;
import java.util.*;
public class pair_the_container {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];


        for(int m=0;m<n; m++){
            a[m]=in.nextInt();
        }
        Arrays.sort(a);
        int i =0;
        int j = n-1;

        while(i<j){
            System.out.println(a[j] + " " + a[i]);
            i++;
            j--;
        }
        if(n%2!=0){
            System.out.println(a[i] + " 0");
        }
    }
}
