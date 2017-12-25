package classesAndObjectTutorial;

/**
 * Created by nkkhan on 12/18/17.
 */
public class Customer {
    String firstName;
    String lastName;
    Account acc;

    public void addAccount(double initialAmount){
        acc = new Account();
        acc.balance = initialAmount;
        System.out.println(acc.accountNumber = "CAP"+ Account.nextAccountNumber++ +" added");
        System.out.println("Routing number: "+ Account.ROUTING_NUMBER);
        System.out.println("Account added for "+firstName+" "+lastName+"\n");
    }
}
