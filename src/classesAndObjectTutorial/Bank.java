package classesAndObjectTutorial;

/**
 * Created by nkkhan on 12/18/17.
 */
public class Bank {
    public static void main(String[] args) {
        Customer naz = new Customer();
        naz.firstName = "Nazmul";
        naz.lastName ="Khan";
        naz.addAccount(400);

        Customer rahil = new Customer();
        rahil.firstName = "Rahil";
        rahil.lastName = "Khan";
        rahil.addAccount(300);

    }
}
