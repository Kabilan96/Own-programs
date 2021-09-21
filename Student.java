package org.student;

import org.department.Department;

public class Student extends Department {

	public void stuentsName() {
		
		String name = "R.KABILAN";
		System.out.println("Student Name:" + name);
	}
	public void studentDept() {
		
		String DeptName  = "ECE";
		System.out.println("Student Department:" + DeptName);
	}
	public void studentId() {
		
		int Id = 106016;
		System.out.println("Student Id:" + Id);

	}
	public static void main(String[] args) {
		
		Student s = new Student();
		
		s.stuentsName();
		s.studentDept();
		s.studentId();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		
	}
}
