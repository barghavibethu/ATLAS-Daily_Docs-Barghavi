import java.util.Scanner;
public class Task011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = "Barghavi";
        String password = "12345";
        int count = 0;
        System.out.print("Enter your login ID: ");
        loginid = sc.nextLine();
        System.out.print("Enter your password: ");
        password = sc.nextLine();

        while (!(loginid.equals("Barghavi") && password.equals("12345"))) {
            count++;
            System.out.println("Incorrect login credentials," + count + " times");
            System.out.print("Enter your login ID: ");
            loginid = sc.nextLine();
            System.out.print("Enter your password: ");
            password = sc.nextLine();
        }
            System.out.print("Login Successful! ");
        sc.close();
        }
    }
