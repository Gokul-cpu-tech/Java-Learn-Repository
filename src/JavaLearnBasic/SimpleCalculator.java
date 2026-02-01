package JavaLearnBasic;

import java.util.Scanner;

public class SimpleCalculator {
	
	static int  a;
	static int  b;

	public static void Addition(){
		
		Scanner sc = new Scanner(System.in);
		
		
		int sum = a + b; 
		System.out.println("Sum is: " + sum); 
		sc.close();
		
	}
	
  public static void Subtraction(){
		
		Scanner sc = new Scanner(System.in);
		
		 
		int diff = a - b; 
		System.out.println("Difference is: " + diff); 
		sc.close();
		
	}
  
  public static void Multiplication(){
		
		Scanner sc = new Scanner(System.in);
		
		 
		int prod = a * b; 
		System.out.println("Product is: " + prod); 
		sc.close();
		
	}
  
  public static void Division(){
		
		Scanner sc = new Scanner(System.in);
		
		
		int div = a / b; 
		System.out.println("Division is: " + div); 
		sc.close();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first number: "); 
	      a = sc.nextInt();
		
		System.out.print("Enter second number: ");
		 b = sc.nextInt();
		 
		System.out.print("Enter arith Operator: "); 
		String op = sc.next(); 
		
		if(op.equals("+") )
		{
			Addition();
		}
		else if(op.equals("-"))
		{
			Subtraction();
		}
		else if(op.equals("*"))
		{
			Multiplication();
		}
		else
		{
			Division();
		}
		sc.close();
}
}
