package homework_date_calander;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by nkkhan on 11/28/17.
 */
public class ExerciseDateCalender {
    public static void main(String[] args) throws ParseException {
        Date myDate = new Date();

//* Print tomorrows date in dd/MM/yy format
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(myDate);
        calendar.add(Calendar.DATE, 1);
        myDate = calendar.getTime();
        System.out.println("\nTomorrows date: "+sdf.format(myDate));

//* Compare todays date to tomorrows date
        Date today = new Date();
        boolean isEqual = today.equals(myDate);
        char space = ' ';
        System.out.println("\nComparing today with tomorrow(are they equal?) ="+space+isEqual);

//* Print current date in this format yyyy-MM-dd
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String currentDate = df.format(Calendar.getInstance().getTime());
        System.out.println("\nCurrent date in yyyy-MM-dd:"+space+currentDate);

//* Parse 1999-11-19 into date format and print the value
        SimpleDateFormat simpleDF = new SimpleDateFormat("yyyy-MM-dd");
        String givenString = "1999-11-19";
        Date givenDate = simpleDF.parse(givenString);
        System.out.println("\nPrinting given value at date format:"+space+givenDate);


    }

}
