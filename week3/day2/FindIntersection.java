package week3.day2;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
public class FindIntersection
{
	public static void main(String[] args)
	{
		Integer [] array1 = {3,2,11,4,6,7};
		Integer [] array2 = {1,2,8,4,9,7};
		
		Set<Integer> set1 = new TreeSet<Integer>(Arrays.asList(array1));
		Set<Integer> set2 = new TreeSet<Integer>(Arrays.asList(array2));
		
		set1.retainAll(set2);
		
		System.out.println("Intersection of array1 & array2 :" +set1);
	}
}