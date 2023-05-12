package week3.day1;
public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("The amount deposited is: 10000 Rs");
	}
	public static void main(String[] args)
	{
		AxisBank acc = new AxisBank ();
		acc.saving();
		acc.fixed();
		acc.deposit();
	}
}