package homework_for_while;

import java.util.Scanner;

/**
 * Created by nkkhan on 12/11/17.
 */
public class WhileDemoGroceryBudget {

    /**
     * Build a gorcery budget system using while loop
     * User can purchase as many item he wishes within the budget limit of $100.00
     * IF the purchased amount exceeds the budget amount, notify the user with appropriate message
     * you must spend all of budget amount
     * Make sure to test your code and avoid possible bugs.
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double BUDGET_AMOUNT = 100.00;    //Budget Amount
        double grandTotal = 0.00;   //total purchase amount after each successful purchase

        System.out.println("\nYour budget amount is $100.00 and you should spend it all.");

        while (grandTotal < BUDGET_AMOUNT) {

            System.out.println("\nPlease enter the amount for your purchase: ");
            //each item price will be stored in CurrentItemPrice variable
            double CurrentItemPrice = scanner.nextDouble();

            //item price should be greater than 0
            if (CurrentItemPrice > 0) {
                double purchaseTotal = grandTotal + CurrentItemPrice;
                double remainingBalance = BUDGET_AMOUNT - purchaseTotal;

                //item will not be added if the amount exceed the remaining balance
                if (remainingBalance < 0) {
                    System.out.println("Error: item cannot be purchased. Amount exceeds budget.");
                    purchaseTotal = grandTotal;
                    remainingBalance = BUDGET_AMOUNT - grandTotal;
                }

                //finished purchased and exit from while loop
                else if (remainingBalance == 0) {
                    System.out.println("Finished purchase for $100.00\nThanks for shopping");
                }

                //item only added with positive value and within budget limit
                else {
                    System.out.print("$" + CurrentItemPrice + " added for the item. ");

                    //printing remaining balance after each purchase and formatted for 2 decimal point amount
                    System.out.printf("Purchase total is $%.2f \nYou have $%.2f more to spend\n", purchaseTotal, remainingBalance);
                }

                grandTotal = purchaseTotal;
            }

            //error message for invalid purchase amount and showing current balance.
            else {
                System.out.print("Error: price cannot be $" + CurrentItemPrice);
                System.out.printf(" you have $%.2f more to spend\n", BUDGET_AMOUNT - grandTotal);
            }
        }
    }
}
