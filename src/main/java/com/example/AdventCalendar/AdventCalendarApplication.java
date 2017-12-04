package com.example.AdventCalendar;

import com.example.AdventCalendar.Year2017.Day1;
import com.example.AdventCalendar.Year2017.Day2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AdventCalendarApplication {

	public static void main(String[] args) {

		SpringApplication.run(AdventCalendarApplication.class, args);
		Day2.split();
	}
}
