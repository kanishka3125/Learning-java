import java.io.*;
import java.util.*;

public class Upper_Triangular_Matrix {
    public static int upt(int a[][], int n){
        for(int i=1; i<n; i++){
            for(int j=0; j<i;j++){
                if(a[i][j]==0){
                    return 0;
                }
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j]= in.nextInt();
            }
        }
        int x=upt(a,n);
        if(x==1){
            System.out.println("Upper Triangular Matrix");
        }
        else{
            System.out.println("Not a Upper Triangular Matrix");
        }
    }
}
