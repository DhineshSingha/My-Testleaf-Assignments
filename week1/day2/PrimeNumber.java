package week1.day2;
import java.util.Scanner;
public class PrimeNumber
{
	public static void main(String[] args)
	{
		Scanner inp= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int a = inp.nextInt();
		int i;
		for (i=2; i<=(a/2); i++)
		{
			if (a%i==0)
			{
				System.out.println("This is not a prime number");
				break;
			}
			else
			{
				System.out.println("This is a prime number");
				break;
			}
		}
	}
}