package Date;

import java.util.Date;
import java.text.DateFormat;
import java.util.Timer;
import java.text.SimpleDateFormat;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Magi
 */
public class InterDate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int region;
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("1. Japan");
            System.out.println("2. English");
            System.out.println("3. Germany");
            System.out.println("4. Vietnam");
            System.out.println("5. Exit program");
            System.out.print("Please choose your region: ");
            region = s.nextInt();
            switch (region) {
                case 1:
                    printDate(Locale.JAPAN);
                    break;
                case 2:
                    printDate(Locale.ENGLISH);
                    break;
                case 3:
                    printDate(Locale.GERMANY);
                    break;
                case 4:
                    printDate(new Locale("vi", "VN"));
                break;
            }
        } while (region != 5);
    }   
    
    private static void printDate(Locale locale) {
        //Get current date
        Date currentDate = new Date();
        //Date
        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.LONG,locale);
        String date = dateFormatter.format(currentDate);
        System.out.println(locale + " : " + date);
        //Time
        DateFormat timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
        String time = timeFormatter.format(currentDate);
        System.out.println(locale + " : " + time);
        //DateTime
        DateFormat dateTimeFormatter = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG,locale);
        String dateTime = dateTimeFormatter.format(currentDate);
        System.out.println(locale + " : " + dateTime);
        //SimpleDateFormat
        SimpleDateFormat sdf;
        sdf=new SimpleDateFormat("EEEE d MMMM yy",locale);
        String dateStr = sdf.format(currentDate);
        System.out.println(locale + " : " + dateStr);
    }
}