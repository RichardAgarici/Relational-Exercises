import java.util.Scanner;

public class Challenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year");
        int year = scanner.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0){
                    if (year % 400 == 0) {
                        System.out.println("It's a leap year");
                    }
                    else {
                        System.out.println("Not a leap year");
                    }
            }
            else {
                System.out.println("Not a leap year");
            }
        } else
            System.out.println("Not a Leap Year");
    }
}
