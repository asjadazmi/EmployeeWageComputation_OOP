package com.bridgelabz;
import java.util.*;

public class EmployeeWageComputation {
    static final int IS_PRESENT=1;
    static final int IS_PART_TIME=2;
	static final int Wage_per_HR=20;
	static final int PART_TIME_hrs=4;
	static final int Full_day_HRS=8;
	public static final int NUM_OF_WORKING_DAYS=20;
	public static int MAX_HRS_IN_MONTH=100;
	public static int computeEmpWage() {
		int totalworkingdays=0;
		int emphrs=0,totalemphrs=0;
		while(totalemphrs<=MAX_HRS_IN_MONTH&&totalworkingdays<NUM_OF_WORKING_DAYS) {
			totalworkingdays++;
			int empcheck=(int)Math.floor(Math.random()*10)%3;
			switch (empcheck) {
			   case IS_PART_TIME:
				   emphrs=4;
				   break;
			   case IS_PRESENT:
				   emphrs=8;
				   break;
			   default:
				   emphrs=0;
				   
			}
			totalemphrs+=emphrs;
			System.out.println("day: "+totalworkingdays+++" emphrs "+emphrs);
			
		}
		int totalempwage=totalemphrs*Wage_per_HR;
		System.out.println("total emp wage"+totalempwage);
		return totalempwage;
		}
	public static void main(String args[]) {
		computeEmpWage();
		
	}
}
