import java.util.Scanner;
public class Task012 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String correctloginid = "Barghavi";
        String correctpassword = "12345";
        int count = 0;
String loginid, password;

        do{
            System.out.println("You have logged in for "+ (count++) +" times.");
            System.out.print("Enter your login and password: ");
            loginid = sc.nextLine();
            password = sc.nextLine();
        } while(!
        (loginid.equals(correctloginid) && password.equals(correctpassword)));
        System.out.println("Login successful");
            sc.close();
        }
    }
