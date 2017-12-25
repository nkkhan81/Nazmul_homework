package homework_bankProject;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by nkkhan on 12/22/17.
 */
public class Transaction {

//private fields for transaction
    private  String transactionDate;
    private String accountId;
    private int routingNumber;
    private double amount;
    private String merchantName;
    private String transactionType;

//constructor with parameter
    public Transaction(String accountId, int routingNumber, double amount, String merchantName, String transactionType) {
        this.accountId = accountId;
        this.routingNumber = routingNumber;
        this.transactionDate = getCurrentDate();
        this.amount = amount;
        this.merchantName = merchantName;
        this.transactionType = transactionType;

    }

// A method which return a current date string which added to the date field
    public static String getCurrentDate(){

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        String currentDate = sdf.format(date);

        return currentDate;
    }

//required getter and setter for fields
    public String getTransactionDate() {
        return transactionDate;
    }
    public String getAccountId() {
        return accountId;
    }
    public int getRoutingNumber() {
        return routingNumber;
    }
    public double getAmount() {
        return amount;
    }
    public String getMerchantName() {
        return merchantName;
    }
    public String getTransactionType() {
        return transactionType;
    }

}

