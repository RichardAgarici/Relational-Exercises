public class SwitchCase {
    public static void main(String[] args) {
        int n = 1;
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not in range.");
                break;
        }

//        float type is not supported in switch
    }
}
