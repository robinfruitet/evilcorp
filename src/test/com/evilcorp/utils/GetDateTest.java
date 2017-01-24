package test.com.evilcorp.utils;

import main.com.evilcorp.utils.GetDate;
import org.junit.Assert;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Robin on 24/01/2017.
 */
public class GetDateTest {
    @Test
    public void stringIsNotNull() {
        String date = "2017-01-01";
        Assert.assertEquals("2017-01-01", GetDate.stringDate(date));
    }

    @Test
    public void stringIsNull() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-dd-MM");
        Date currentDate = new Date();
        String sCurrentDate = sdf.format(currentDate);
        String date = null;
        Assert.assertEquals(sCurrentDate, GetDate.stringDate(date));
    }
}
