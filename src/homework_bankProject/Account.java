package homework_bankProject;

/**
 * Created by nkkhan on 12/23/17.
 */
public class Account {

    private static final String BANK_NAME = "Technosoft Bank";  //static field for bank name
    private double balance;
    private String accountId;
    private static int nextId = 12345;                          //static field for nextId
    private static final int ROUTING_NUMBER = 50001;            //static field for routing number

    private int numberOfTransaction = 1;                        //int variable for array element which will increase after adding each element

    Transaction[] transactions = new Transaction[100];          //declared and initialise an array for storing transactions


    public void deposit(double depositAmount) {
        if (depositAmount < 0) {    //validating amount
            System.out.println("Not a valid amount to deposit.\n");

        } else {
            balance = balance + depositAmount;
            System.out.println("Deposited amount: " + depositAmount +
                    " Current balance: " + balance);

            //if deposit successful then only the transaction object will be added to the array
            transactions[numberOfTransaction++] = new Transaction(accountId, ROUTING_NUMBER, depositAmount, BANK_NAME, "Deposit");
        }

    }

    public void withdrawal(double withdrawalAmount) {
        if ((balance - withdrawalAmount) < 0) {  //validation
            System.out.println("Insufficient fund. Withdrawal not processed.\n");

        } else {
            balance -= withdrawalAmount;
            System.out.println("Withdrawal amount: " + withdrawalAmount + " Current balance = " + balance);

            //if withdrawal successful then only the transaction object will be added to the array
            transactions[numberOfTransaction++] = new Transaction(accountId, ROUTING_NUMBER, withdrawalAmount, BANK_NAME, "Withdrawal");
        }

    }

    //transfer() method for different bank. user should provide all information regarding transfer
    public void transfer(String accountId, int routingNumber, double amount, String merchantName) {

        if ((balance - amount) < 0) {    //validation for amount
            System.out.println("Insufficient fund. Transfer to the account #" + accountId + " not processed.\n");

        } else {
            balance -= amount;

            System.out.println("Transfer successful for $" + amount + " Current balance = $" + balance+"\n");

            //if transfer successful then only the transaction object will be added to the array
            transactions[numberOfTransaction++] = new Transaction(accountId, routingNumber, amount, merchantName, "Transfer");
        }
    }

//overloaded transfer() method for the transfer to the same bank
//bankName and routingNumber has been set default for same bank
    public void transfer(String accountId, double amount) {
        transfer(accountId, getRoutingNumber(), amount, getBankName());
    }

    //this method will display all transaction for a particular customer/account
    public void printTransaction() {

        System.out.println(" Total transactions: " + (numberOfTransaction - 1)); // -1 because numberOfTransaction get increase after adding each object to the array

        //
        for (int i = 1; i < numberOfTransaction; i++) {

            //for a particular element(i) calling each field and adding them together
            System.out.println(i + ". " + transactions[i].getTransactionDate() + "," + "\t" + " Type: " + transactions[i].getTransactionType() +
                    ", \tRouting No: " + transactions[i].getRoutingNumber() + ", \tAccount ID: " + transactions[i].getAccountId() +
                    ", \tMerchant: " + transactions[i].getMerchantName() + ", \tAmount: " + transactions[i].getAmount());
        }
        System.out.println("Current balance = "+getBalance()+"\n");
    }

    //this method display account information
    public void displayAccountDetails() {
        System.out.println("*** Account Details ***");
        System.out.println("Account ID: " + accountId);
        System.out.println("Balance = " + getBalance() + "\n");
    }


    //getters and setters for fields

    public static String getBankName() {
        return BANK_NAME;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public static int getNextId() {
        return nextId++;
    }

    public static int getRoutingNumber() {
        return ROUTING_NUMBER;
    }
}
