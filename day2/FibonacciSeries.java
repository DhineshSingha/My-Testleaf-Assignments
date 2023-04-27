package week1.day2;
import java.util.Scanner;
public class FibonacciSeries
{
	public static void main(String[] args)
	{
		System.out.print("Please specify the range: ");
		Scanner inp = new Scanner (System.in);
		int range = inp.nextInt();
		int fNum=0, sNum=1, sum=0;
		System.out.println(fNum);
		System.out.println(sNum);
		for (int i=2; i<range; i++)
		{
			sum=fNum+sNum;
			fNum=sNum;
			sNum=sum;
			System.out.println(sum);
		}
	}
}