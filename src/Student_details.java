/*
 * PROBLEM: Print Student Details (Name, Age, CGPA, Grade)
 *
 * INPUT FORMAT:  String (Name) -> Int (Age) -> Float (CGPA) -> Char (Grade)
 * CONSTRAINT:    CGPA must be truncated to 2 decimal places (No rounding up!)
 *
 * SAMPLE 0:      Input: Rajeev, 20, 8.6467, B  -> Output: CGPA: 8.64
 * SAMPLE 1:      Input: Meera, 18, 9.123, A    -> Output: CGPA: 9.12
 */

import java.util.Scanner;
public class Student_details {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Name = in.nextLine();
        int Age = in.nextInt();
        float CGPA = in.nextFloat();
        char Grade = in.next().charAt(0);

        // using shift right and shift left
        float truncatedCGPA = ((int)(CGPA*100)/100f);

        System.out.println("Name: " + Name);
        System.out.println("Age: " + Age);
        System.out.printf("CGPA: %.2f\n", truncatedCGPA);
        System.out.println("Grade: " + Grade);
    }
}

