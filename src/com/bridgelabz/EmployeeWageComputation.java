package com.bridgelabz;
import java.util.*;

public class EmployeeWageComputation {
    static final int IS_PRESENT=1;
    static final int IS_PART_TIME=2;
	static final int Wage_per_HR=20;
	static final int PART_TIME_hrs=4;
	static final int Full_day_HRS=8;
	public static void check() {
		 int tototalwage=0;
		double check =Math.floor(Math.random()*10)%3;
		if (check==IS_PRESENT) {
			tototalwage=Wage_per_HR*Full_day_HRS;
		}
		else if(check==IS_PART_TIME) {
			tototalwage=PART_TIME_hrs*Wage_per_HR;
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
