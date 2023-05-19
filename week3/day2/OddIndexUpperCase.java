package week3.day2;
public class OddIndexUpperCase
{
	public static void main(String[] args)
	{
		String test = "changeme";
		char[] upcase = test.toCharArray();
		System.out.println(upcase);
		System.out.println();
		
		for (int i=0; i<upcase.length; i++)
		{
			if (i%2!=0)
				System.out.print(Character.toUpperCase(upcase[i]));
			else
				System.out.print(upcase[i]);
		}
	}
}