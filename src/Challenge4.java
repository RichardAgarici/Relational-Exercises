import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a day number");
        int day = scanner.nextInt();
        if (day == 1)
            System.out.println("Your day is Monday");
        else if (day == 2) {
            System.out.println("Your day is Tuesday");

        }        else if (day == 3) {
            System.out.println("Your day is Wed");

        }        else if (day == 4) {
            System.out.println("Your day is Thu");

        }        else if (day == 5) {
            System.out.println("Your day is Fri");

        }        else if (day == 6) {
            System.out.println("Your day is Sat");
        }
        else System.out.println("Your day is Sun");
    }
}
