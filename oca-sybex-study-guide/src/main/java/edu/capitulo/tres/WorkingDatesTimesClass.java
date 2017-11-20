package edu.capitulo.tres;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class WorkingDatesTimesClass {

	public static void main(String[] args) {
		WorkingDatesTimesClass inst = new WorkingDatesTimesClass();
		inst.metodoCreatingDatesTimes();
		inst.metodoDefineLocalDateTime();
		inst.metodoPlusMinusDatesTimes();
		inst.metodoPeriod();
		inst.metodoFormattingDateTimes();
		inst.metodoParsingDates();
	}

	public void metodoCreatingDatesTimes() {
		System.out.println("\n>>>>> INICIA metodoCreatingDatesTimes");
		System.out.println(LocalDate.now()); // 2017-01-20
		System.out.println(LocalTime.now()); // 12:45:18.401
		System.out.println(LocalDateTime.now()); // 2017-01-20T12:45:18.401
		System.out.println("<<<<< TERMINA metodoCreatingDatesTimes");
	}

	public void metodoDefineLocalDateTime() {
		System.out.println("\n>>>>> INICIA metodoCreatingDatesTimes");
		LocalDate date1 = LocalDate.of(2017, Month.JANUARY, 13); // 2017-01-13
		LocalDate date2 = LocalDate.of(1989, 01, 13); // 1989-01-13
		System.out.println(date1);
		System.out.println(date2);

		LocalTime time1 = LocalTime.of(6, 15); // 06:15
		LocalTime time2 = LocalTime.of(6, 15, 30); // 06:15:30
		LocalTime time3 = LocalTime.of(6, 15, 30, 200); // 06:15:30.000000200
		System.out.println(time1);
		System.out.println(time2);
		System.out.println(time3);

		LocalDateTime dateTime1 = LocalDateTime.of(2017, Month.JANUARY, 13, 6, 15, 30);
		LocalDateTime dateTime2 = LocalDateTime.of(date1, time1);
		System.out.println(dateTime1);
		System.out.println(dateTime2);
		System.out.println("<<<<< TERMINA metodoCreatingDatesTimes");
	}

	public void metodoPlusMinusDatesTimes() {
		System.out.println("\n>>>>> INICIA metodoManipulatingDatesTimes");
		LocalDate date = LocalDate.of(2014, Month.JANUARY, 20);
		System.out.println(date);
		date = date.plusDays(2); // add two days
		System.out.println(date);
		date = date.plusWeeks(1); // add one week
		System.out.println(date);
		date = date.plusMonths(1); // add one month
		System.out.println(date);
		date = date.plusYears(5); // add five years
		System.out.println(date);

		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(5, 15);
		LocalDateTime dateTime2 = LocalDateTime.of(date2, time2); // 2020-01-20T05:15
		System.out.println(dateTime2);
		dateTime2 = dateTime2.minusDays(1); // 2020-01-19T05:15
		System.out.println(dateTime2);
		dateTime2 = dateTime2.minusHours(10);// 2020-01-18T19:15
		System.out.println(dateTime2);
		dateTime2 = dateTime2.minusSeconds(30);// 2020-01-18T19:14:30
		System.out.println(dateTime2);

		// Lo mismo que arriba
		LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time3 = LocalTime.of(5, 15);
		LocalDateTime dateTime3 = LocalDateTime.of(date3, time3).minusDays(1).minusHours(10).minusSeconds(30);
		System.out.println(dateTime3);
		System.out.println("<<<<< TERMINA metodoManipulatingDatesTimes");
	}

	public void metodoPeriod() {
		System.out.println("\n>>>>> INICIA metodoPeriod");
		LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
		LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
		Period period = Period.ofMonths(1);
		LocalDate upTo = start;
		while (upTo.isBefore(end)) {
			System.out.println("Give new toy" + upTo);
			upTo = upTo.plus(period);
		}
		System.out.println("<<<<< TERMINA metodoPeriod");
	}

	public void metodoFormattingDateTimes() {
		System.out.println("\n>>>>> INICIA metodoFormattingDateTimes");
		LocalDate date = LocalDate.of(2020, Month.FEBRUARY, 20);
		System.out.println(date.getDayOfWeek());//THURSDAY
		System.out.println(date.getMonth()); //FEBRUARY
		System.out.println(date.getYear()); //2020
		System.out.println(date.getDayOfYear()); //51
		
		LocalDate date2 = LocalDate.of(2020, Month.JANUARY, 20);
		LocalTime time2 = LocalTime.of(11, 12, 34);
		LocalDateTime dateTime2 = LocalDateTime.of(date2, time2);
		System.out.println(date2.format(DateTimeFormatter.ISO_LOCAL_DATE));//2020-01-20
		System.out.println(time2.format(DateTimeFormatter.ISO_LOCAL_TIME));//11:12:34
		System.out.println(dateTime2.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));//2020-01-20T11:12:34
		
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		//20/01/20 En todos estos casos
		System.out.println(shortDateTime.format(date2));
		System.out.println(shortDateTime.format(dateTime2));
		System.out.println(dateTime2.format(shortDateTime));
		System.out.println(date2.format(shortDateTime));
		
		
		DateTimeFormatter mediumF = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		DateTimeFormatter longF = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		DateTimeFormatter fullF = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		DateTimeFormatter patternF = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
		System.out.println(dateTime2.format(mediumF)); //20/01/2020
		System.out.println(dateTime2.format(longF)); //20 de enero de 2020
		System.out.println(dateTime2.format(fullF)); //lunes 20 de enero de 2020
		System.out.println(dateTime2.format(patternF));//enero 20, 2020, 11:12
		System.out.println("<<<<< TERMINA metodoFormattingDateTimes");
	}
	
	
	public void metodoParsingDates(){
		System.out.println("\n>>>>> INICIA metodoParsingDates");
		DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
		LocalDate date = LocalDate.parse("01 02 2015", f);
		LocalTime time = LocalTime.parse("11:22");
		System.out.println(date);
		System.out.println(time);
		System.out.println("<<<<< TERMINA metodoParsingDates");
	}

}
