package week3.day2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
public class RemoveDuplicateWords
{
	public static void main(String[] args)
	{
		String text = "We learn java basics as part of java sessions in java week1";
		String[] spltext = text.split(" ");
		Set<String> RemDup = new LinkedHashSet <String> ();
		for (int i=0; i<spltext.length; i++)
		{
			RemDup.add(spltext[i]);
		}
		Iterator<String> its = RemDup.iterator();
		for (int i=0; i<RemDup.size(); i++)
		System.out.print(its.next() + " ");
	}
}