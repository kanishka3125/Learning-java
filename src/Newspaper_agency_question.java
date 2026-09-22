import java.util.Scanner;
public class Newspaper_agency_question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c = input.nextInt();
        int cp = input.nextInt();
        int sp = input.nextInt();
        int cpp  = c*cp;
        int spp = c*sp;

        System.out.println((spp-cpp)-100);
    }

}
