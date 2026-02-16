package JavaLearnBasic;

public class stringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String ch = "MADAM";
		String originalch = ch;
		String rev = "";
		
		
		// Simple code using stringbuilder

		/*StringBuilder sb = new StringBuilder(ch);
		sb.reverse();
	
		String rev = sb.toString();   // SAVE here reversed string  */
		
		// Code using Loop;
		
		int i = ch.length()-1;
		
		while (i >= 0)
		{
			 rev = rev + ch.charAt(i);
			i=i-1;
		}

	
	if (originalch.equals(rev))
	{ 
		System.out.println("The given number is palindrome");
	}
	else
	{
		System.out.println("The given number is not a palindrome");
	}  
	}

}
