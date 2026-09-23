import java.util.Scanner;public class online_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int m=0; m<n; m++){
            a[m]=in.nextInt();
        }
        int i=0;
        int j=n-1;
        while(i<j){
            while(i<j && a[i]%2==0){
                i++;
            }
            while(i<j && a[j]%2!=0){
                j--;
            }
            int t = a[i];
            a[i]=a[j];
            a[j]=t;
        }
        System.out.println("Array after Segregation");
        for(int k=0; k<n; k++) {
            System.out.print(a[k]+" ");
        }
        in.close();
    }
}