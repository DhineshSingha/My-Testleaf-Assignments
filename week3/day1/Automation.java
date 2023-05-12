package week3.day1;
public class Automation extends MultipleLanguage implements TestTool, Language
{
	public void java()
	{
		System.out.println("This is implemented from Language Interface");
	}
	public void selenium()
	{
		System.out.println("This is implemented from TestTool Interface");
	}
	@Override
	public void ruby()
	{
		System.out.println("This is extended from MultipleLanguage Abstract Class");
	}
	public static void main(String[] args)
	{
		Automation obj = new Automation ();
		obj.java();
		obj.selenium();
		obj.ruby();
		obj.python();
	}
}