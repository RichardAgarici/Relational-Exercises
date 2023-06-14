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

        switch (day){
            case 1:
                System.out.println("Your day is "+ "Monday");
                break;
            case 2:
                System.out.println("Your day is "+ "Tuesday");
                break;
            case 3:
                System.out.println("Your day is "+ "Wednesday");
                break;
            case 4:
                System.out.println("Your day is "+ "Thursday");
                break;
            case 5:
                System.out.println("Your day is "+ "Friday");
                break;
            case 6:
                System.out.println("Your day is "+ "Sunday");
                break;
            case 7:
                System.out.println("Your day is "+ "Saturday");
                break;
            default:
                System.out.println("Your day number is invalid");
                break;
        }
    }
}
