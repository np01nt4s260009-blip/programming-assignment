import java.util.Scanner;
public class scholarshipEligibilityCheckerweek04 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter GPA (0.0 TO 4.0: ");
        double gpa = sc.nextDouble();
        
        if (gpa < 0.0 || gpa > 4.0) {
            System.out.println("Error: Invalid GPA. please enter a value between0.0 to 4.0");
        }
        
        else if (gpa >= 3.7) {
            System.out.println("Grade: A");
            System.out.println("The student is elidigible for scholarship");
        }
        
        else if (gpa >= 3.0) {
            System.out.println("Grade: B");
            System.out.println("The student is not elidigible for scholarship");
        }
        
        else if (gpa >= 2.0) {
            System.out.println("Grade: C");
            System.out.println("The student is not elidigible for scholarship");
        }
        
        else if (gpa >= 1.0) {
            System.out.println("Grade: D");
            System.out.println("The student is not elidigible for scholarship");
        }
        else {
            System.out.println("Grade: F");
        }
        sc.close();
    }
}