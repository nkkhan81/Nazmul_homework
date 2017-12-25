package homework_methodAndCalculator;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by nkkhan on 12/14/17.
 */
public class Part1Methods {
    //decleared a public scanner to use in all method
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;

        while (!quit){  //while quit = false the while loop will continue
            printInstruction(); //input instruction for users
            int switchValue = scanner.nextInt();    //accept option as input to run the programme as per user direction

            switch (switchValue){
                case 1:
                    System.out.println("Today's date is: "+getCurrentDate()); //implement method to get current date
                    break;
                case 2:
                    getSqrt();  //implement method to get square root of a number
                    break;
                case 3:
                    getCurrentSeason(); //implement method to get current season
                    break;
                case 4:
                    System.out.println("Good bye!!!");
                    quit = true;    // boolean quit = true, that means the programme will exit from while loop
                    break;
                default:
                    System.out.println("please choose a number from 1 to 4");
                    quit = false;   //if user type any other number, the program will rerun with a message

            }
        }
    }


    public static String getCurrentDate(){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String currentDate = sdf.format(Calendar.getInstance().getTime());

        return currentDate;
    }

    public static void getSqrt(){
        System.out.print("Please enter a number to get square root: ");
        double inputValue = scanner.nextDouble();
        double sqrtValue = Math.sqrt(inputValue);
        System.out.println("Square root of "+inputValue+" is: "+sqrtValue);;
    }

    public static void getCurrentSeason(){  //method to get current season
        System.out.println("Please enter the month name to know the SEASON:");
        scanner.nextLine(); //user will type the month and the program will show the season
        String month = scanner.nextLine();
        switch (month.toLowerCase()){
            case "december":
            case "january":
            case "february" :
                System.out.println("This is Winter here. Too cold!!!");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("This is Spring");
                break;
            case "june" :
            case "july":
            case "august":
                System.out.println("Finally Summer is here");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Lovely Autumn");
                break;
        }
    }


    public static void printInstruction(){
        System.out.println("----------------------" +
                "\nWelcome to Info Center" +
                "\nPlease press:" +
                "\n\t1 => to get today's date." +
                "\n\t2 => to get square root of a number" +
                "\n\t3 => to know current season" +
                "\n\t4 => to quit!");
    }

}
