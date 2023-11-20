import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
public class simpleDateFormat{
    public static void main(String args[]){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
        String strDate = formatter.format(date);
        System.out.println("Date format with mm/dd/yyyy: "+strDate);
        formatter = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("Date format with dd mm yyyy:hh:mm:ss "+strDate);
        formatter = new SimpleDateFormat("dd mm yyyy");
        strDate = formatter.format(date);
        System.out.println("Date format with dd mm yyyy: "+strDate);
    }
}
