package week1.day2;
import java.util.Scanner;
public class NegativeToPositive
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner inp = new Scanner (System.in);
		int num= inp.nextInt();
		if (num<0)
			System.out.println("The number "+num+" is converted to the positive number: "+(-1*num));
		else
			System.out.println("You've entered a positive number");
	}
}