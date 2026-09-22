import java.io.*;
import java.util.*;

public class strong_number {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); //145
        int originalNum = num; //145
        int sum = 0;

        while(num > 0) {
            int digit = num%10; //5 //4 //1

            int fact = 1;
            for(int i =1; i<=digit; i++) { //digit = 5 // digit =4 //digit = 1
                fact *= i; //fact = 120 // fact =24 fact =1
            }

            sum += fact; //sum = 0+120=120 // sum = 120+24=144 //sum = 144+1
            num /= 10; //num = 14 // num = 1 //num = 0

        }
        if(sum==originalNum){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }



    }
}
