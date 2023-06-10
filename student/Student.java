package org.student;

import org.department.Department;

public class Student extends Department {

	public void studentName(String name)
	{
		System.out.println(" Student name :"+name);
	}
	public void studentId(int id)
	{
		System.out.println("Student Id :"+id);
	}
	public void Studentdept(String name)
	{
		System.out.println("Student Dept :"+name);
	}
	public static void main(String[] args) 
	{
	Student stu=new Student();
	stu.collegeCode(18);
	stu.collegeName("PSG");
	stu.collegeRank(1);
	stu.deptName();
	stu.Studentdept("CSE");
	stu.studentId(1);
	stu.studentName("Aish");
	}
}
