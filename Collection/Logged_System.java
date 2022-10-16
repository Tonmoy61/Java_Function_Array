/* Suppose a software system excepts valid credentials from user to logged in to the system.
if the user inputs wrong password for 3 times, system will say that "Your user has been temporary locked".
Let the username: admin, password: adm1n */
package Function_And_Array;
import java.util.Scanner;

public class Logged_System {
    public static void main(String[] args) {
        String myUsername;
        String myPassword;

        myUsername = "admin";
        myPassword = "adm1n";

        Scanner input = new Scanner(System.in);

        for( int i = 0; i < 3; i ++)
        {

            System.out.println("Enter Username : ");
            String username = input.nextLine();

            System.out.println("Enter Password : ");
            String password = input.nextLine();

            if (username.equals(myUsername) && password.equals(myPassword))
            {
                System.out.println("Access Granted! Welcome!");
            }

            else if (username.equals(myUsername))
            {
                System.out.println("Invalid Password!");
            }
            else if (password.equals(myPassword))
            {
                System.out.println("Invalid Username!");
            }
            else
            {
                System.out.println("Invalid Username & Password!");
            }

        }
        System.out.println("Your are temporary locked");
        input.close();

    }
}
