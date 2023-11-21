import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter height: ");
        int height = scanner.nextInt();
        scanner.close();

        if (height < 150) {
            System.out.println("The person is dwarf");
        } else if (height == 150) {
            System.out.println("The person is average");
        } else {
            System.out.println("The person is tall");
        }
    }
}
