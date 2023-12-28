package com.greatlearning.driverclass;

import com.greatlearning.admindepartment.AdminDepartment;
import com.greatlearning.hrdepartment.HrDepartment;
import com.greatlearning.superdepartment.SuperDepartment;
import com.greatlearning.techdepartment.TechDepartment;

public class Main {

	// Main method
	public static void main(String[] args) {
		
		// Object Instantiation
		AdminDepartment admindepartment = new AdminDepartment();
		HrDepartment hrdepartment = new HrDepartment();
		TechDepartment techdepartment = new TechDepartment();
		
		// static method invoked
		displayDepartmentFunctionalities(admindepartment);
		displayDepartmentFunctionalities(hrdepartment);
		displayDepartmentFunctionalities(techdepartment);
	}
	
	
	// static and Parameterized method 
	public static void displayDepartmentFunctionalities(SuperDepartment department) {
		
		System.out.println("Welcome to " + department.departmentName());
		
		// using instanceof to check the relation
		if(department instanceof HrDepartment) {
			
			HrDepartment hrdepartment = (HrDepartment) department; // Type Casting to access the doActivity method.
			System.out.println(hrdepartment.doActivity());
		}
		
		System.out.println(department.getTodaysWork());
		System.out.println(department.getWorkDeadline());
		
		// using instanceof to check the relation
		if(department instanceof TechDepartment) {
			
			TechDepartment techdepartment = (TechDepartment) department; // Type Casting to access the getTechStackInformation method.
			System.out.println(techdepartment.getTechStackInformation());
		}
		
		System.out.println(department.isTodayAHoliday());
		
		System.out.println();
	}
}
