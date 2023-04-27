package week1.day2;
import java.util.Scanner;
public class NegativeNeutralPositive
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner inp = new Scanner (System.in);
		int num= inp.nextInt();
		if (num<0)
			System.out.println("You've entered a negative number: "+num);
		else if (num==0)
			System.out.println("You've entered a neutral number: "+num);
		else
			System.out.println("You've entered a positive number: "+num);
	}
}