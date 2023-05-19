package week3.day2;
import java.util.TreeSet;
public class PrintDuplicate
{
	public static void main(String[] args)
	{
		int [] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		TreeSet<Integer> set1 = new TreeSet<Integer>();
		System.out.print("The Duplicate values are: ");
		
		for(Integer val : arr)
		{
			if(!set1.add(val))
				System.out.print(val + ", ");
		}
	}
}