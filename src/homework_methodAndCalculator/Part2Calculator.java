package homework_methodAndCalculator;

import java.util.Scanner;

/**
 * Created by nkkhan on 12/15/17.
 */
public class Part2Calculator {

    public static Scanner scanner = new Scanner(System.in);

    public static void addTwoNumbers(){ //add method
        System.out.print("Enter first number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("\nEnter second number to add: ");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber+secondNumber;
        System.out.println("The addition of "+firstNumber+" and "+secondNumber+" is: "+result);
        scanner.nextLine();
    }

    public static void subTwoNumbers(){ //subtract method
        System.out.print("Enter a number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("\nEnter another number to subtract: ");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber - secondNumber;
        System.out.println("The subtraction from "+firstNumber+" to "+secondNumber+" is: "+result);
        scanner.nextLine();
    }


    public static void multiplyTwoNumbers(){ //multiply method
        System.out.print("Enter a number: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("\nEnter another number: ");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber * secondNumber;
        System.out.println("The multiplication of "+firstNumber+" and "+secondNumber+" is: "+result);
        scanner.nextLine();
    }

    public static void divideTwoNumbers(){  //divition method
        System.out.print("Enter dividend: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("\nEnter the divisor: ");
        double secondNumber = scanner.nextDouble();
        double result = firstNumber / secondNumber;
        System.out.println("The Division of "+firstNumber+" by "+secondNumber+" is: "+result);
        scanner.nextLine();
    }

    public static void options(){
        System.out.println("----------------------" +
                "\nChoose your option:" +
                "\n|A|  -  for addition" +
                "\n|S|  -  for subtraction" +
                "\n|M|  -  for multiplication" +
                "\n|D|  -  for division" +
                "\n|E|  -  to exit from the calculator");
    }

    public static void main(String[] args) {

        System.out.println("\nThis is a simple CALCULATOR which operates with 2 numbers.");
        boolean quit = false;

        while (!quit){  //while quit = false the while loop will continue
            options(); //input instruction for users
            String switchValue = scanner.nextLine();    //accept option as input to run the programme as per user direction

            switch (switchValue.toLowerCase()){
                case "a":
                    addTwoNumbers(); //implemented method to add number
                    break;
                case "s":
                    subTwoNumbers();  //implemented method to subtract number
                    break;
                case "m":
                    multiplyTwoNumbers(); //implemented method to multiply 2 number
                    break;
                case "d":
                    divideTwoNumbers(); //implemented method to divide a number
                    break;
                case "e":
                    System.out.println("Thanks for using the CALCULATOR.");
                    quit = true;    // boolean quit = true, that means the programme will exit from while loop
                    break;
                default:
                    System.out.println("invalid option typed. Please check available options.");
                    quit = false;   //if user type any other number, the program will rerun with a message

            }
        }

    }
}
