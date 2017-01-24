package main.com.evilcorp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Robin on 24/01/2017.
 */
public class GetDate {

    public static String stringDate(String arg) {
        if (arg != null)
            return arg;
        else {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
            Date currentDate = new Date();
            return sdf.format(currentDate);
        }
    }
}
