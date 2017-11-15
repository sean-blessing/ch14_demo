package ch14_demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the LocalDateTimeApp!");
		doDates();
		System.out.println("bye");
	}

	private static void doDates() {
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("LocalDate = "+date);
		System.out.println("LocalTime = "+time+",\n LocalDateTime = "+dateTime);
		
		int orderDay = dateTime.getDayOfMonth();
		//LocalDateTime deliveryDate = dateTime.withDayOfMonth(orderDay+20);
		LocalDateTime deliveryDate = dateTime.plus(20,ChronoUnit.DAYS);
		
		System.out.println("dlv date = " + deliveryDate);
		System.out.println("order date = "+dateTime);
		
		System.out.println("between = "+ChronoUnit.WEEKS.between(dateTime, deliveryDate));
		System.out.println("until = "+dateTime.until(deliveryDate, ChronoUnit.DAYS));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
		DateTimeFormatter df = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter tf = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		System.out.println("formatted dlvDate - date time (MEDIUM)= "+dtf.format(deliveryDate));
		System.out.println("formatted dlvDate - date (FULL)= "+df.format(deliveryDate));
		System.out.println("formatted dlvDate - time (MEDIUM)= "+tf.format(deliveryDate));
		System.out.println("formatted order date = "+dtf.format(dateTime));
		
		
//		ZonedDateTime laZone = dateTime.atZone(ZoneId.of("America/Los_Angeles"));
//		//ZonedDateTime estZone = dateTime.atZone(ZoneId.of("America/Los_Angeles"))
//		System.out.println("LA DateTime = "+laZone);
//		LocalDate christmas = LocalDate.of(2017, 12, 25);
//		System.out.println("Christmas Day:  "+christmas);
//		
//		LocalDateTime newYears = LocalDateTime.of(2017, 12, 31, 23, 59);
//		System.out.println("New Years Eve:  "+newYears);
//		
//		LocalDate turkeyDay = LocalDate.parse("2017-11-23");
//		LocalDate turkeyDay2 = LocalDate.of(2017, 11, 23);
//		System.out.println("Thanksgiving:  "+turkeyDay);
//		
//		System.out.println("\npulling data out of datetime...");
//		int year = dateTime.getYear();
//		Month month = dateTime.getMonth();
//		int month2 = dateTime.getMonthValue();
//		int dayOfMonth = dateTime.getDayOfMonth();
//		
//		System.out.println(year);
//		System.out.println(month);
//		System.out.println(month2);
//		System.out.println(dayOfMonth);
//		
//		// compare newyears to current datetime
//		if (newYears.isAfter(dateTime)) 
//			System.out.println("new years after current date");
//		else
//			System.out.println("new years before or equal to current date");
//		
//		System.out.println("\ncompareTo examples...");
//		System.out.println("newYears to currentDate="+newYears.compareTo(dateTime));
		
		
		
		
		
		
		
	}
}
