package gara.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import gara.test.EventBean.Status;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<EventBean> list = new ArrayList<EventBean>();
        list.add(new EventBean(Status.DONE,parseDate("2021-03-31 11:32:45")));
        list.add(new EventBean(Status.UNDONE,parseDate("2021-02-28 11:45:45")));
        list.add(new EventBean(Status.DONE,parseDate("2021-01-31 12:32:45")));
        list.add(new EventBean(Status.UNDONE,parseDate("2020-03-31 10:32:45")));
        list.add(new EventBean(Status.DONE,parseDate("2021-12-31 08:54:45")));
        list.add(new EventBean(Status.CANCELED,parseDate("2021-03-21 11:12:23")));
        list.add(new EventBean(Status.DONE,parseDate("2021-03-31 11:32:45")));
        list.add(new EventBean(Status.CANCELED,parseDate("2021-03-21 11:12:22")));
        list.add(new EventBean(Status.DONE,parseDate("2021-03-31 11:32:46")));
        list.add(new EventBean(Status.UNDONE,parseDate("2021-03-31 11:32:45")));
        list.add(new EventBean(Status.DONE,parseDate("2021-03-31 11:32:44")));
        list.add(new EventBean(Status.SKIPPED,parseDate("2021-03-31 11:32:43")));
        list.add(new EventBean(Status.SKIPPED,parseDate("2021-03-31 11:32:45")));
        list.forEach((e) -> System.out.println(e)); 
        list.sort(new DateTimeStatusComparator());
        System.out.println("Post compare");
        list.forEach((e) -> System.out.println(e)); 
 
        
        
    }
    
    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(date);
        } catch (ParseException e) {
            return null;
        }
     }
}
