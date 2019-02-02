package test;

import java.util.Date;
import java.util.Random;

public class Hello {
	public static void main(String[] args) {
//		Date d1 = new Date();
//		System.out.println("time in this moment");
//		System.out.println(d1);
//		System.out.println();
//		Date d2 = new Date(5000);
//		System.out.println("from 1st JAN 2019, morning, during 5 second");
//		System.out.println(d2);
		Date d1 = new Date();
		long second = 1000;
		long min = 60 * second;
		long hour = 60 * min;
		long day = 24 * hour;
		long year = 365* day;
		int leapDay = ((1995 -1970)/4);
		//star years
		long year1995 = (1995 - 1970)*year;

		year1995+= leapDay * day;

		long correcthour= hour*5;
		year1995 += correcthour;
		
		System.out.println(year1995);
		Date TimeStar = new Date(year1995);
		System.out.println("The first day of 1995 is:" +TimeStar);
		
		Date TimeLast = new Date(year1995 + year -1);
		System.out.println("The Last day of 1995 is:" +TimeLast);
		
//		System.out.println("Have " + (1995 -1970)/4 + " leap Days");
//		long newrandom = random() * year + year1995;
		
		long nn = year1995 + (long)(Math.random()*year);
		Date OneDay = new Date(nn);
		System.out.println(nn);
		System.out.println("The random of this year have a day is " + OneDay);
	}


}
