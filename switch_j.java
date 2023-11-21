import java.util.Scanner;

public class switch_j {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the numeric grade: ");
            int number = scanner.nextInt();
            char grade = calculateGrade(number);
            System.out.println("The calculated grade is: " + grade);
        }
    }
    public static char calculateGrade(int number) {
        char grade;

        if (number >= 80) {
            grade = 'A';
        } else if (number >= 70) {
            grade = 'B';
        } else if (number >= 60) {
            grade = 'C';
        } else if (number >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }
}
