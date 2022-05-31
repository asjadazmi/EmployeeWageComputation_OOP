package com.bridgelabz;
import java.util.*;

public class EmployeeWageComputation {
	public static void check() {
		int IS_PRESENT=1;
		double check =Math.floor(Math.random()*10)%2;
		if (check==IS_PRESENT) {
			System.out.println("Employee is present....");
		}
		else {
			System.out.println("Employee is absent.....");
		}
}
	public static void main(String args[]) {
		check();
	}
}
