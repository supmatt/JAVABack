package test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Date F1 = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
//		String str = sdf.format(F1);
//		
//		System.out.println("The first time format by YYYY-MM-DD + hour: " + str);
//		SimpleDateFormat scf = new SimpleDateFormat("yyyy-MM-dd");
//		String str2 = scf.format(F1);
//		System.out.println("The first time format by YYYY-MM-DD: " + str2);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/DD HH:mm:ss");
//		Date d1 = new Date();
//		String str = sdf.format(d1);
//		System.out.println("String "+ str + " use the format yyyy-MM-DD HH:mm:ss");
////		
//		try {
//			
//			Date d = sdf.parse(str);
//			System.out.println("An other explan is " + d.toString());
//		} catch (ParseException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
//		
		long s = 1000;
		long m = 60*s;
		long h = 60*m;
		long day = 24*h;
		long year = 365*day;
		long diff = (2001 - 1970)*year;
		double yearofday = (double)(2001 - 1970)/4;
		
		double num = yearofday%1;
		System.out.println(yearofday);
		System.out.println(num);
		
		if(num>0.5) {
			long runyear = (long) (Math.ceil(yearofday) *day);
			long max = 0 + diff + runyear + 5*h -1;
			Date d1 = new Date(max);
			System.out.println("Answer " + d1);
			System.out.println("num>05 " + max);
		} else {
			long runyear = (long) (Math.floor(yearofday) *day);
			long max = 0 + diff + runyear + 5*h -1;
			Date d1 = new Date(max);
			System.out.println("Answer " + d1);
			System.out.println("num<05 " + max);
		}

		
		

	}

}
