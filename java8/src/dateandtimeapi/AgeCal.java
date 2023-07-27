package dateandtimeapi;

import java.time.LocalDate;
import java.time.Period;

public class AgeCal {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		LocalDate dob = LocalDate.of(1984, 7, 31);
		Period p= Period.between(dob, date);
		System.out.println("Years:"+p.getYears()+"Months"+p.getMonths()+"Days:"+ p.getDays());

	}

}
