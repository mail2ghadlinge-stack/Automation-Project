import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LoginWithoutScanner {
    public static void main(String[] args) throws IOException {
        String correctUser = "admin";
        String correctPass = "1234";

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter username: ");
        String username = br.readLine();

        System.out.print("Enter password: ");
        String password = br.readLine();

        if (username.equals(correctUser) && password.equals(correctPass)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Invalid username or password");
        }
    }
}