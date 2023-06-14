import java.util.Scanner;

public class Challenge2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num;
        System.out.println("Enter your number");
        num = sc.nextLine();

        if (num.matches("[01]+"))
            System.out.println("Binary Radix = 2");
        else if (num.matches("[0-7]+"))
            System.out.println("Octal Radix = 8");
        else if (num.matches("[0-9A-F]+")) {
            System.out.println("Hexadecimal radix = 16");
        }else
            System.out.println("Not a number");
    }
}
