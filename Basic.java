import java.util.Scanner;

public class Basic {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("My name is Gourvi");
        System.out.println("My name is gupta");

        String name;
        int age;
        System.out.println("What is Your name ? ");
        name=scan.nextLine();
        System.out.println("What is Your age ? ");
        age = scan.nextInt();
    }
}
