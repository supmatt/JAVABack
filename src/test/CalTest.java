package test;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalTest {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Calendar c = Calendar.getInstance();
//		Date d = c.getTime();
//		Date d2 = new Date(0);
//		c.setTime(d2);
//		System.out.println(sdf.format(d));
		Calendar c = Calendar.getInstance();
		Date now = c.getTime();//time of now
		System.out.println(now);// print time of this time
		
		c.setTime(now);
		c.add(Calendar.MONTH, 1);
		System.out.println(c.getTime());//time of next month
		
		c.setTime(now);
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());//time of last year
		
		c.setTime(now);
		c.add(Calendar.MONTH, -1);
		c.set(Calendar.DATE, 3);
		System.out.println(c.getTime());//3ere day of last month
		System.out.println(format(c.getTime()));
	}
		private static String format(Date time) {
			return sdf.format(time);
		}
}
