import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0) System.out.println("number is od");
        else System.out.println("number is even");

        scanner.nextLine();
        Integer age = scanner.nextInt();
        if (age < 18) System.out.println("You are young");
        else if (age >= 18 && age < 35) {
            System.out.println("You are middle");
        } else System.out.println("You are old");

        int m1, m2, m3;
        System.out.println("Enter mark of 3 Subjects");
        m1=scanner.nextInt();
        m2=scanner.nextInt();
        m3=scanner.nextInt();

        float avg = (float) (m1+m2+m3) / 3 ;
        if(avg>=70)
            System.out.println("Grade A");
        else if (avg>=60 && avg <70) {
            System.out.println("Grade B");
        }
        else if (avg >=50 && avg <60) {
            System.out.println("Grade C");
        }
        else {
            System.out.println("Grade F");
        }
    }
}
