import java.util.Scanner;

public class do_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int i = 1;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println("The sum of numbers from 1 to " + n + " is: " + sum);
        scanner.close();
    }
}
