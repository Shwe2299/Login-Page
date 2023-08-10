
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        LoginManager loginManager= new LoginManager();

        //adding users information
        loginManager.addUser(new User("Shwe", "12345678"));
        loginManager.addUser(new User("Mary", "45678910"));

        //Using scanner to get user input for checking login credentials
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username:");
        String userName = scanner.nextLine();
        System.out.println("Password:");
        String password = scanner.nextLine();
        
        //check for username and password, if matches, success.
        if(loginManager.isValidUser(userName, password)){
            System.out.println("Login Success!");
        } else {
            System.out.println("Login Failed! Please check your username and password again!");
        }

        scanner.close();
    }
}
