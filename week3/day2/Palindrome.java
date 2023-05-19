package week3.day2;
public class Palindrome
{
	public static void main(String[] args)
	{
		String orig = "Madam";
		String rev = "";
		
		for (int i=orig.length()-1; i>=0; i--)
			rev = rev + orig.charAt(i);
			
		if (rev.equalsIgnoreCase(orig))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}