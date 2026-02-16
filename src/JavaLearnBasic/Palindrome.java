package JavaLearnBasic;

public class Palindrome {

	public static void main(String[] args) {
	
		int num = 121;
		int originalnum = num;
		int reverse = 0;
		
		while(num != 0)
		{
			int lastdigit = num%10;
			reverse = reverse * 10 + lastdigit;
			num = num/10;
		
		}
		
		System.out.println("The Reversed Number is:" +reverse);	
	
	if (originalnum == reverse)
	{ 
		System.out.println("The given number is palindrome");
	}
	else
	{
		System.out.println("The given number is not a palindrome");
	}  
				 
	
	}

}
