import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}
