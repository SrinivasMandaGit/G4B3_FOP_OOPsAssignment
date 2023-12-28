package com.greatlearning.techdepartment;

import com.greatlearning.superdepartment.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	
	//Implementation of methods with return type as String.
	
	public String departmentName() 	{ return "Tech Department"; }
	
	public String getTodaysWork() 	{ return "Complete coding of module 1"; }
	
	public String getWorkDeadline() { return "Complete by EOD"; }
	
	public String getTechStackInformation() { return "Core Java"; }

}
