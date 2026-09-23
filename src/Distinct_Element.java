import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;
public class Distinct_Element{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Size of an array: "+n);
        int a[] = new int[n];
        int count=0;

        for(int m=0; m<a.length; m++){
            a[m]=in.nextInt();
        }
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]==a[j]){
                    a[j]=-1;
                }
            }
        }
        for(int k=0; k<a.length; k++){
            if(a[k]!=-1){
                count++ ;
            }
            else{
                continue;
            }
        }
        System.out.print("There are " + count + " distinct elements in the array");
        in.close();
    }

}