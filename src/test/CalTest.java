package test;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class CalTest {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		Date d = c.getTime();
		Date d2 = new Date(0);
		c.setTime(d2);
		System.out.println(d);
		
	}

}
