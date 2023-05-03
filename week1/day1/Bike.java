package week1.day1;
public class Bike
{
	public void applyBreak()
	{
		System.out.println("Bike Applied break");
	}
	public void soundHorn()
	{
		System.out.println("Bike Sound Horn");
	}
	public static void main(String[] args)
	{
		Car objc = new Car();
		Bike objb = new Bike();
		objc.applyBreak();
		objc.soundHorn();
		objb.applyBreak();
		objb.soundHorn();
	}
}