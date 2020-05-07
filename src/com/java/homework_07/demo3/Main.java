package com.java.homework_07.demo3;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
public class Main {
	public static void main(String[] args){
		LocalDate birthday = LocalDate.of(2000, Month.DECEMBER,17);
		LocalDate nowDate = LocalDate.now();
		System.out.println(birthday);
		System.out.println(nowDate);
		long day = ChronoUnit.DAYS.between(birthday,nowDate);
		System.out.println(day);
	}
}
