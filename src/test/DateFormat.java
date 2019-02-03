package test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	@SuppressWarnings("deprecation")
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
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		Date start = new Date(0);
		Date DD = new Date();
		double yearofday = (double)(2001 - 1970)/4;
		
		double num = yearofday%1;
//		System.out.println(yearofday);
//		System.out.println(num);
		long runyear;
		if(num>0.5) {
			runyear = (long) (Math.ceil(yearofday) *day);
			
//			System.out.println("Answer " + d1);
		} else {
			runyear = (long) (Math.floor(yearofday) *day);
			
//			System.out.println("Answer " + d1);
		}
		long max = 0 + diff + runyear + 5*h -1;
		Date d1 = new Date(max);
		Date[] Darray = new Date[9];
		System.out.println("Get the 9 random arrary: ");
		for(int i = 0; i < Darray.length; i++) {
			Darray[i] = new Date((long)(Math.random() *max) + start.getTime()) ;
			if(i%3 ==2 ) {
				System.out.println(sdf.format(Darray[i]));
			}else {
				System.out.print(sdf.format(Darray[i]) + "\t");
			}
		}
		System.out.println("After Array the Items, we get: ");
		
		
		long[] Total = new long[9];
		
		for(int i = 0; i < Total.length; i++) {
			long ho = 0;
			Date demo = new Date();
			ho = Darray[i].getTime();
			for(int j = 0; i < Total.length; i++) {
				long ho2 = 0;
				
				ho2 = Darray[j].getTime();
				
				if(ho < ho2) {
					long ho3 = ho2; ho2 = ho; ho = ho3;
					
				}
			}	
			
		}
		for(int i = 0; i < Darray.length; i++) {
			
			if(i%3 ==2 ) {
				System.out.println(sdf.format(Darray[i]));
			}else {
				System.out.print(sdf.format(Darray[i]) + "\t");
			}
		}
		Date tt = new Date(max);
		System.out.println(sdf.format(tt.getTime()));
	}

}
