package week1.day1;
public class Report
{
	public static void main(String[] args)
	{
		Student obj = new Student();
		System.out.println("Student Name: "+obj.studentName);
		System.out.println("Roll No: "+obj.rollNo);
		System.out.println("College Name: "+obj.collegeName);
		System.out.println("Marks Scored: "+obj.markScored);
		System.out.println("CGPA: "+obj.cgpa+"%");
	}
}