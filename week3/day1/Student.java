package week3.day1;
public class Student
{
	public void getStudentInfo(int id)
	{
		System.out.println("The Student ID is: " + id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("The Student ID is: " + id);
		System.out.println("The Student Name is: " + name);
	}
	public void getStudentInfo(String email, String ph_no)
	{
		System.out.println("The Student mail ID is: " + email);
		System.out.println("The Student Phone Number is: " + ph_no);
	}
	public static void main(String[] args)
	{
		Student stu = new Student ();
		stu.getStudentInfo(12345);
		stu.getStudentInfo(54321, "Dhinesh Singha");
		stu.getStudentInfo("dhineshsinghak@gamil.com", "9600051969");
	}
}