package com.greatlearning.hrdepartment;

import com.greatlearning.superdepartment.SuperDepartment;

public class HrDepartment extends SuperDepartment {

	// Implementation of methods with return type as String.

	public String departmentName() {
		return "Hr Department";
	}

	public String getTodaysWork() {
		return "Fill today’s timesheet and mark your attendance";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

	public String doActivity() {
		return "Team Lunch";
	}

}
