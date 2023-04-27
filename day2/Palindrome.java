package week1.day2;
import java.util.Scanner;
public class Palindrome
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number: ");
		Scanner inp = new Scanner (System.in);
		int num= inp.nextInt(), reverse=0;
		for (int i = num;i != 0; i = i/10)
		{
		int remainder = i%10;
		reverse = reverse*10 + remainder;
		}
		if (num==reverse)
			System.out.println("This is a palindrome");
		else
			System.out.println("This is not a palindrome");
	}
}