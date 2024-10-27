package java8_date_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			//create DateTimeFormetter instance
			DateTimeFormatter formatter=DateTimeFormatter.ofPattern("d-M-yyyy");
			// create current date : w/o time or time zone
			LocalDate d1 = LocalDate.now();
			System.out.println(d1);// toString of LocalDate : rets formatted date
			// localdate corresponding to 31st Dec 2020
			LocalDate d2 = LocalDate.of(2020, 3, 31);
			System.out.println(d2);// toString of LocalDate : rets formatted date
			System.out.println("Enter join date of the 1st emp : yr-mon-day");
			LocalDate joinDate=LocalDate.parse(sc.next());
			System.out.println("join date "+joinDate);
			System.out.println("Enter join date of 2nd  emp : day-mon-yr");//13-6-2022
			LocalDate joinDate2=LocalDate.parse(sc.next(), formatter);
			System.out.println(joinDate2);
			//display who is more senior ?
			System.out.println("Senior Emp : "+(joinDate.isBefore(joinDate2)?"1st emp":"2ndEmp"));
			System.out.println("Enter manufacture date of Bread : yr-mon-day ");
			//display expiry date after 3 days.
			System.out.println("Bread's expiry date "+LocalDate.parse(sc.next()).plusDays(3));
			
			
			
		}

	}

}
