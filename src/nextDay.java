
import java.util.Date;

public class nextDay {
    public static void main(String[] args) {
        Date now=new Date();
        System.out.println(getNextDate(now));
    }
    public static Date getNextDate(Date d){
        long addTime=1;
        addTime *=1;
        addTime *=24;
        addTime *=60;
        addTime *=60;
        addTime *=1000;
        Date date=new Date(d.getTime() +addTime);
        return date;

    }
}
