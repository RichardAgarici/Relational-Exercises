import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a URL");
        String url = scanner.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        if (protocol.equals("http"))
            System.out.println("Hypertext Transfer Protocol");
        else if (protocol.equals("ftp")) {
            System.out.println("File Transfer Protocol");
        } else
            System.out.println("I don't know this URL, check if this is a legal one.");

        String ext = url.substring(url.lastIndexOf(".") + 1);

        if (ext.equals("com"))
            System.out.println("Commercial");
        else if (ext.equals("org")) {
            System.out.println("Organisation");
        } else if (ext.equals("net")) {
            System.out.println("Network");
        } else
            System.out.println("I don't know this extension. Check it again it's correct.");

        switch (ext){
            case "com" :
                System.out.println("Commercial");
                break;
            case "org" :
                System.out.println("Organisation");
                break;
            case "net" :
                System.out.println("Network");
                break;
            default:
                System.out.println("I don't know this one.");
                break;
        }

    }
}
