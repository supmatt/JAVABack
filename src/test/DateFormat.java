package test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.lang.ArrayIndexOutOfBoundsException;
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
//		// set basic date information
		long s = 1000;
		long m = 60*s;
		long h = 60*m;
		long day = 24*h;
		long year = 365*day;
		long diff = (2001 - 1970)*year;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss"); // set format of explain
		Date start = new Date(0); // Year of 1979
		double yearofday = (double)(2001 - 1970)/4;
		
		double num = yearofday%1;

		long runyear;
		//set ÈòÄê 
		if(num>0.5) {
			runyear = (long) (Math.ceil(yearofday) *day);
		} else {
			runyear = (long) (Math.floor(yearofday) *day);
		}
		
		long max = 0 + diff + runyear + 5*h -1;  //get last hour of 2000
		
		Date[] Darray = new Date[9]; // set 9 Array
		System.out.println("Get the 9 random arrary: ");
		//Obtain date detail
		for(int i = 0; i < Darray.length; i++) {
			Darray[i] = new Date((long)(Math.random() *max) + start.getTime()) ;
			if(i%3 ==2 ) {
				System.out.println(sdf.format(Darray[i]));
			}else {
				System.out.print(sdf.format(Darray[i]) + "\t");
			}
		}
		System.out.println("After Array the Items, we get: ");//print 9 date detail
		
		//set new format and create new array by time
		String[] Darray2 = new String[9];
		SimpleDateFormat sdf2 = new SimpleDateFormat("HHmmss");
		for(int i = 0; i<Darray.length; i++) {
			Darray2[i] = sdf2.format(Darray[i]);
		}
		
//		System.out.println(Darray2[1]);
		//Arrange the new array
		for(String i: Darray2) {
//			System.out.println(i);
			for(String j:Darray2) {
				int nn = Integer.parseInt(i);
				int mm = Integer.parseInt(j);
//				int nn = Integer.parseInt(Darray2[i]);
//				int mm = Integer.parseInt(Darray2[j]);
				if(nn > mm) {
					String ti = i;
					i=j;
					j= ti;
					
				}
			}
			
		}
		System.out.println(Darray2[1]);
//		for(int i = 0; i < Darray2.length; i++) {
//			
//			if(i%3 ==2 ) {
//				System.out.println(sdf.format(Darray2[i]));
//			}else {
//				System.out.print(sdf.format(Darray2[i]) + "\t");
//			}
//		}
//		Date tt = new Date(max);
//		System.out.println(sdf.format(tt.getTime()));
	}

}
