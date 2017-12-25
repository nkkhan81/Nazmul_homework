package homework_bankProject;

/**
 * Created by nkkhan on 12/23/17.
 */
public class Customer {

//fields for this class
    private String firstName;
    private String lastName;
    private Account acc;        //Account class also used as a field

//constructor with parameter for Customer class
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

//default constructor for Customer class
    public Customer() {
        this.firstName = "John";
        this.lastName = "Doe";
    }

//Method for adding an account with an initial amount
    public void addAccount(double initialAmount){
        acc = new Account();
        acc.setAccountId("ACCT"+acc.getNextId());
        acc.setBalance(initialAmount);
        System.out.println("Account created for: "+getFirstName()+" "+getLastName());
        acc.displayAccountDetails();
    }

//overloaded method method with same name as addAccount().
//this time account added with a fixed amount
    public void addAccount(){
        addAccount(100);
    }


//getters for fields

    public  String getFirstName() {
        return firstName;
    }


    public  String getLastName() {
        return lastName;
    }

    public Account getAcc() {
        return acc;
    }
}
