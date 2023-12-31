package com.greatlearning.admindepartment;

import com.greatlearning.superdepartment.SuperDepartment;

public class AdminDepartment extends SuperDepartment {

	// Implementation of methods with return type as String.

	public String departmentName() {
		return "Admin Department";
	}

	public String getTodaysWork() {
		return "Complete Your Documents Submission";
	}

	public String getWorkDeadline() {
		return "Complete by EOD";
	}

}
