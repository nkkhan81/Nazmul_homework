package homework_if_switch;

import java.util.Scanner;


public class CarMoodUpdated {

    /**
     * I want to be able to put car on P mode, D mode, N mode, R mode
     * If i am on P mode and parking type is parallel then i can park between two cars
     * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
     * If i am on N mode i can put car in car wash station
     * If i am on R mode I can only reverse the car and car will activate back camera
     * If mode is incorrect then print me invalid mode type, please check your car mode
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] carMood = {"P","D","N","R"};
        String snowType = "SNOW";
        String sportsType = "SPORT";
        String regType = "REGULAR";

        System.out.println("Select the Car Mood from available option:" +
                "\nP\tD\tN\tR");
        String inputCarMood = scanner.nextLine();
        if (inputCarMood.toUpperCase().equals(carMood[0])){
            System.out.println("\nParking type is parallel and your car parked between two cars");
        }else if (inputCarMood.toUpperCase().equals(carMood[1])){
            System.out.println("Drive mood activated." +
                    "\nSelect your drive type:\tSNOW\tSPORT\tREG");
            String driveType = scanner.nextLine();
            if (driveType.toUpperCase().equals(snowType)){
                System.out.println("you are driving in "+snowType+" mood");
            }else if (driveType.toUpperCase().equals(sportsType)){
                System.out.println("you are driving in "+sportsType+" mood");
            }else if (driveType.toUpperCase().equals("REG")){
                System.out.println("you are driving in "+regType+" mood");
            }
            else {
                System.out.println("Invalid drive type entered. " +
                        "\nPlease check available drive mood");
            }
        }else if (inputCarMood.toUpperCase().equals(carMood[2])){
            System.out.println("\nNeutral[N] Mood" +
                    "\nYou can put car in car wash station");
        }else if (inputCarMood.toUpperCase().equals(carMood[3])){
            System.out.println("\nReverse[R] Mood" +
                    "\tYou can reverse the car. Back camera is activated.");
        }else {
            System.out.println("\nInvalid mode type, please check your car mode");
        }
    }
}
