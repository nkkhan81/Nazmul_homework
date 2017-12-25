package homework_bankProject;

/**
 * Created by nkkhan on 12/23/17.
 */
public class Main {
    public static void main(String[] args) {

        Customer defaultCustomer = new Customer();
        defaultCustomer.addAccount();
        defaultCustomer.getAcc().withdrawal(600); //not enough balance, withdrawal will not process. Not a transaction
        defaultCustomer.getAcc().deposit(2000);
        defaultCustomer.getAcc().transfer("4567755",420);
        defaultCustomer.getAcc().transfer("5453434",23345,200,"Santander");
        defaultCustomer.getAcc().deposit(-122); //invalid amount to deposit. Not a transaction


        Customer nazmul = new Customer("Nazmul","Khan");
        nazmul.addAccount(500);
        nazmul.getAcc().deposit(200);
        nazmul.getAcc().transfer("1233456",43211,230,"Chase");

        Customer rahil = new Customer("Rahil","Khan");
        rahil.addAccount(1200);
        rahil.getAcc().deposit(500);
        rahil.getAcc().withdrawal(250);
        rahil.getAcc().transfer("23455",320);
        rahil.getAcc().transfer("234234",5000); //Not a transaction

        defaultCustomer.getAcc().deposit(150);
        nazmul.getAcc().withdrawal(225.45);
        rahil.getAcc().transfer("TEC23545",500);



        System.out.print(nazmul.getFirstName());    //print the name of the account
        nazmul.getAcc().printTransaction();         //print all transactions for that particular account

        System.out.print(rahil.getFirstName());
        rahil.getAcc().printTransaction();

        System.out.print(defaultCustomer.getFirstName());
        defaultCustomer.getAcc().printTransaction();

    }
}
