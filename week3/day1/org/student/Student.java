package org.student;
import org.department.Department;
public class Student extends Department
{
	public void studentName()
	{
		System.out.println("Student Name: Dhinesh Singha");
	}
	public void studentDept()
	{
		System.out.println("Student Department: BSc. Computer Science");
	}
	public void studentID()
	{
		System.out.println("Student ID: 123456789");
	}
	public static void main(String[] args)
	{
		Student obj = new Student ();
		obj.studentName();
		obj.studentID();
		obj.studentDept();
		obj.departmentName();
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
	}
}