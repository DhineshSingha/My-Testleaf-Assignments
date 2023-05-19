package week3.day2;
public class ReverseEvenWords
{
	public static void main(String[] args)
	{
		String test = "I am a software tester";
		String[] words = test.split(" ");
		
		for (int i=0; i<words.length; i++)
			if(i%2 == 0)
				System.out.println(words[i]);
			else
			{
				String evenword = words[i];
				String revword = "";
				for (int j=words[i].length()-1; j>=0; j--)
					revword = revword + evenword.charAt(j);
				System.out.println(revword);
			}
	}
}