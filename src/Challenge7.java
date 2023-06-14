import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("====");
        System.out.println("Add");
        System.out.println("Sub");
        System.out.println("Mul");
        System.out.println("Div");
        System.out.println("Enter 2 Numbers");
        int x = sc.nextInt();
        int v = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option in Words ");
        String option = sc.nextLine();
        switch (option) {
            case "ADD":
                System.out.println("Sum is " + (x + v));
                break;
            case "SUB":
                System.out.println("Sub is " + (x - v));
                break;
            case "MUL":
                System.out.println("Mul is " + (x * v));
                break;
            case "DIV":
                System.out.println("Div is " + (x / v));
                break;
            default:
                System.out.println("This is not a valid one");
                break;
        }
    }
}
