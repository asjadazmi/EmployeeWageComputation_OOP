package com.bridgelabz;
import java.util.*;

public class EmployeeWageComputation {
    static final int IS_PRESENT=1;
    static final int IS_PART_TIME=2;
    private final String Company;
    private static int Wage_per_HR;
    private int totalEmpWage;
    private static int NUM_OF_WORKING_DAYS ;
    private static int MAX_HRS_IN_MONTH;
    
    public  EmployeeWageComputation(String Company,int Wage_per_HR,int NUM_OF_WORKING_DAYS,int MAX_HRS_IN_MONTH) {
    	this.Company=Company;
    	this.Wage_per_HR=Wage_per_HR;
//		this.totalEmpWage = totalEmpWage2;
    	this.NUM_OF_WORKING_DAYS=NUM_OF_WORKING_DAYS;
    	this.MAX_HRS_IN_MONTH=MAX_HRS_IN_MONTH;
		
	 }
    
	public static void computeEmpWage() {
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
		
		}
	@Override
	public String toString() {
		return "total employee wage for company:"+Company+"is: "+totalEmpWage;
		
	}
	public static void main(String args[]) {
		EmployeeWageComputation dmart=new EmployeeWageComputation("dmart",20,2,10);
		dmart.computeEmpWage();
		
		
		
	}
}
