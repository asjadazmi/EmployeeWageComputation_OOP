package com.bridgelabz;
import java.util.*;

public class EmployeeWageComputation {
    static final int IS_PRESENT=1;
    static final int IS_PART_TIME=2;
	
	public static int computeEmpWage(String Company,int Wage_per_HR,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH) {
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
		computeEmpWage("reliance",50,2,10);
		computeEmpWage("Walmart",30,4,14);
		
	}
}
