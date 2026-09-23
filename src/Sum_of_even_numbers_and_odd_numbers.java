import java.util.Scanner;
public class Sum_of_even_numbers_and_odd_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int es=00;
        int os=0;
        for(int m=0;m<n; m++){
            a[m]=in.nextInt();
        }
        for(int i=0; i<n; i++){
            if(a[i]%2==0){
                es+=a[i];
            }
            else{
                os+=a[i];
            }
        }
        System.out.println("Sum of even numbers is "+es);
        System.out.println("Sum of even numbers is "+os);
        in.close();
    }
}
