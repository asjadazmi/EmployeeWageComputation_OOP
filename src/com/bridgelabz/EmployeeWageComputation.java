package com.bridgelabz;
import java.util.*;

public class EmployeeWageComputation {
    static final int IS_PRESENT=1;
	static final int Wage_per_HR=20;
	static final int Full_day_HRS=8;
	public static void check() {
		 int tototalwage=0;
		double check =Math.floor(Math.random()*10)%2;
		if (check==IS_PRESENT) {
			tototalwage=Wage_per_HR*Full_day_HRS;
		}
		else {
			tototalwage=0;
		}
		System.out.println("tototalwage: "+(tototalwage));
}
	public static void main(String args[]) {
		check();
		
	}
}
