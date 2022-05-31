package com.bridgelabz;
import java.util.*;

public class EmployeeWageComputation {
    static final int IS_PRESENT=1;
    static final int IS_PART_TIME=2;
	static final int Wage_per_HR=20;
	static final int PART_TIME_hrs=4;
	static final int Full_day_HRS=8;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static void check() {
		int emphrs=0,empwage=0,totalEmpwage=0;
		for(int day=0;day<NUM_OF_WORKING_DAYS;day++) {
			int empcheck=(int)Math.floor(Math.random()*10)%3;
			switch (empcheck) {
			   case IS_PRESENT:
				   emphrs=8;
				   break;
			   case IS_PART_TIME:
				   emphrs=4;
				   break;
			   default:
				   emphrs=0;
				   
			}
			empwage=emphrs*Wage_per_HR;
			totalEmpwage+= empwage;
			System.out.println(" emp wage="+empwage+"emphrs "+" "+emphrs);
			System.out.println("total emp wage"+totalEmpwage+"$");
		}}
	public static void main(String args[]) {
		check();
		
	}
}
