import java.io.*;
import java.util.*;

public class positive_missing_value_in_array {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a[] = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        // Sort the array
        Arrays.sort(a);

        int c = 1;

        System.out.print("Missing positive values: ");

        for (int i = 0; i < n; i++) {

            // Ignore numbers smaller than c
            if (a[i] < c) {
                continue;
            }

            // Number exists, so move to the next expected number
            else if (a[i] == c) {
                c++;
            }

            // There is a gap
            else if (a[i] > c) {

                while (c < a[i]) {
                    System.out.print(c + " ");
                    c++;
                }

                // Skip the current existing number
                c++;
            }
        }

        in.close();
    }
}
