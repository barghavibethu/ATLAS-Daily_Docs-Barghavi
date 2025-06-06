import java.util.Scanner;
public class Task006 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your login ID: ");
        String id = sc.nextLine();
        System.out.print("Enter your password: ");
        String pwd = sc.nextLine();

        System.out.println("Hi, ");
        System.out.println("Your login id is "+id);
        System.out.println("And your pwd is "+pwd);
        sc.close();
    }
}
