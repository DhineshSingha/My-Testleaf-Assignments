package week3.day2;
import java.util.Arrays;
public class Anagram
{
	public static void main(String[] args)
	{
		String text1 = "stops";
		String text2 = "potss";
		
		if (text1.length() == text2.length())
		{
			char[] Atext1 = text1.toCharArray();
			char[] Atext2 = text2.toCharArray();
			Arrays.sort(Atext1);
			Arrays.sort(Atext2);
			if (Arrays.equals(Atext1, Atext2))
				System.out.println("Both the words have same alphabets and alphabet count");
		}
		else
			System.out.println("Both the words have different alphabets or alphabet count");
	}
}