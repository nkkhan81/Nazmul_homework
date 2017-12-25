package homework_if_switch;

/**
 * Created by nkkhan on 12/6/17.
 */
public class CarMood {

    /*
     * I want to be able to put car on P mode, D mode, N mode, R mode
     * If i am on P mode and parking type is parallel then i can park between two cars
     * If i am on D mode I can put drive type to Snow type, Sport Type or Regular type
     * If i am on N mode i can put car in car wash station
     * If i am on R mode I can only reverse the car and car will activate back camera
     * If mode is incorrect then print me invalid mode type, please check your car mode
     */

    public static void main(String[] args) {

        char mood = 'R';
        System.out.println("\nYour car is in \""+mood+"\" mood");

        if (mood == 'P'){
            System.out.println("Parking type is parallel and your car parked between two cars");
        }else if (mood == 'D'){
            System.out.println("You can put drive type to Snow type, Sport Type or Regular type");
        }else if (mood == 'N'){
            System.out.println("You can put car in car wash station");
        }else if (mood == 'R'){
            System.out.println("You can reverse the car, back camera is activated.");
        }else {
            System.out.println("Invalid mode type, please check your car mode");
        }


//Tried with an alternative way with Scanner
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEnter your car mood: ");
        String mood = scanner.nextLine().toUpperCase();

        if (mood.equals("P")){
            System.out.println("\nParking type is parallel and your car parked between two cars");
        }else if (mood.equals("D")){
            System.out.println("\nYou can put drive type to Snow type, Sport Type or Regular type");
        }else if (mood.equals("N")){
            System.out.println("\nYou can put car in car wash station");
        }else if (mood.equals("R")){
            System.out.println("\nYou can reverse the car and back camera is activated.");
        }else {
            System.out.println("\nInvalid mode type, please check your car mode");
        }*/

    }
}
