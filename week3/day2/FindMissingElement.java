package week3.day2;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class FindMissingElement
{
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,7,6,8};
		
		Set<Integer> sortarr = new TreeSet<Integer> ();
		for (int i = 0; i<arr.length; i++)
			sortarr.add(arr[i]);
		
		System.out.println(sortarr);
		
		List<Integer> me = new LinkedList<Integer>(sortarr);
		for (int i : me)
			if(me.get(i) != i+1)
			{
				System.out.println("The missing element is: " + (i+1));
				break;
			}
	}
}