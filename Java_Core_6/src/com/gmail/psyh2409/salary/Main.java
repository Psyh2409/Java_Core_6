package com.gmail.psyh2409.salary;

public class Main {
	public static void main(String[] args) {
		Salary eph = new EmployeePerHour();
		Salary epm = new EmployeePerMonth();
		
		eph.salary();
		epm.salary();
	}
	//Output
	//My salary is $100 per hour.
	//My salary is $2000 per month.
}
