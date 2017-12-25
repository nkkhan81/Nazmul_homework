package classesAndObjectTutorial;

/**
 * Created by nkkhan on 12/18/17.
 */
public class Account {

    double balance;
    String accountNumber;
    static int nextAccountNumber = 5432101;
    static final int ROUTING_NUMBER = 560094;

    public void  deposit(double depositAmount){
        balance = balance + depositAmount;
    }

    public void  withdrawal(double withdrawalAmount){
        balance = balance - withdrawalAmount;
    }
}
