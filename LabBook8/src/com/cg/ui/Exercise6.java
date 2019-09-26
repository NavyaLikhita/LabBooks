package com.cg.ui;

import java.time.LocalDate;
import java.time.Period;

public class Ex6 {
		public static void main(String[] args) {
		LocalDate ld=LocalDate.of(2016,04,12);
		Exercise6.dateCalculation(ld);
	}
		public static void dateCalculation(LocalDate ld) {
			LocalDate l=LocalDate.now();
			Period diff=Period.between(ld, l);
			System.out.println("Date Difference yyyy/mm/dd :  "+diff.getYears()+"/"+diff.getMonths()+"/"+diff.getDays());
		}
}
