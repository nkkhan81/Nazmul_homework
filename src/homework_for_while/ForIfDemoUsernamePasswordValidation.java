package homework_for_while;

import java.util.Scanner;

/**
 * Created by nkkhan on 12/11/17.
 */
public class ForIfDemoUsernamePasswordValidation {

    /**
     * Homework:
     * Create a system that checks valid username and password
     * And if they both are valid then only system displays homepage
     * User can only try upto 5 times with invalid login details
     * if it reaches 5 times then system should be locked for 10 min
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //taking input for user name and storing in a variable
        System.out.println("Please enter your user name");
        String actualUserName = scanner.nextLine();

        //taking input for password storing in a variable
        System.out.println("Please enter your password");
        String actualPassword = scanner.nextLine();

        //expected username and password
        String expectedUserName = "admin";
        String expectedPassword = "test123";

        //User can attempt maximum 5 time for login
        for (int i = 1; i<5; i++){

            //checking if the user input username and password match with expected username, password
            //if both match than user can successfully login to system
            if (actualUserName.equals(expectedUserName) && actualPassword.equals(expectedPassword)){

                System.out.println("Congratulation!!! ");
                System.out.println("You have successfully logged in." +
                        "\nWelcome to homepage");
                break;


            }
            //countdown for tries
            else {
                System.out.println("Your user name or password is incorrect. Login unsuccessful");
                System.out.println("You have "+(5-i)+" more tries");

                //reassigning the value for username and password by taking input
                System.out.println("Please enter correct user name");
                actualUserName = scanner.nextLine();

                System.out.println("Please enter correct password");
                actualPassword = scanner.nextLine();

                //after final try user will get message of system lock
                if (i == 4){
                    System.out.println("System locked. You have finished all your tries. " +
                            "\nTry to login back after 10 minutes.");
                }
            }
        }
    }
}
