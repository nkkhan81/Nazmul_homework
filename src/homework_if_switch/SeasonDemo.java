package homework_if_switch;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by nkkhan on 12/6/17.
 */
public class SeasonDemo {
    public static void main(String[] args) {

//      Using Calender class
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM");
        String currentMonth = sdf.format(Calendar.getInstance().getTime());
        System.out.println("\n"+currentMonth+" month");

//      Using Java Date and Time API
        //LocalDate today = LocalDate.now();
        //String currentMonth = today.getMonth().name();

        switch (currentMonth.toLowerCase()){
            case "december":
            case "january":
            case "february" :
                System.out.println("This is Winter here. Too cold!!!");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Now this is Spring season");
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

}
