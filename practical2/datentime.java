package practical2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class datentime {

	public static void main(String[] args) {
		   LocalDate date = LocalDate.now();               // Current date
	        LocalTime time = LocalTime.now();               // Current time
	        LocalDateTime dateTime = LocalDateTime.now();   // Current date + time

	        System.out.println("Date: " + date);
	        System.out.println("Time: " + time);
	        System.out.println("DateTime: " + dateTime);

	        // Format the datetime
	        String formatted = dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"));
	        System.out.println("Formatted: " + formatted);
	    }
	

	}


