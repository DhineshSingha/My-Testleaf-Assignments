package week3.day2;
import java.util.TreeSet;
public class FindSecondLargest
{
	public static void main(String[] args)
	{
		int [] data = {3,2,11,4,6,7};
		
		TreeSet <Integer> arrange = new TreeSet <Integer> ();
		for (int i=0; i<data.length; i++)
			arrange.add(data[i]);
		
		arrange.remove(arrange.last());
		System.out.println("The second largest number is: " + (arrange.last()));
	}
}