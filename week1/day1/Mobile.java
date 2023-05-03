package week1.day1;
public class Mobile
{
	public void makeCall()
	{
		String mobileModel="Oneplus 7T Pro";
		System.out.println("Model: "+mobileModel);
		float mobileWeight=210.50f;
		System.out.println("Weight: "+mobileWeight);
	}
	public void sendMsg()
	{
		boolean isFullCharged=false;
		if (isFullCharged == false)
		{
			System.out.println("Is the mobile fully charged: No");
		}
		else
		{
			System.out.println("Is the mobile fully charged: Yes");
		}
		int mobileCost=49999;
		System.out.println("Cost of the mobile: "+mobileCost);
	}
	public static void main(String[] args)
	{
		Mobile obj=new Mobile();
		System.out.println("This is my mobile");
		obj.makeCall();
		obj.sendMsg();
	}
}