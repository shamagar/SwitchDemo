

package com.switchCaseDemo;

import java.util.Scanner;

public class lunchMenuDrivenProgram 
{

	public static void main(String[] args) 
	{
		System.out.println("***Menu:***");
		System.out.println("==========");
		System.out.println("1.ADD");
		System.out.println("2.SUBTRACT");
		System.out.println("3.MULTIPLY");
		System.out.println("4.DIVISION");
		System.out.println("5.EXIT");
		
		System.out.println(" ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		//To avoid the Buffer problem
		sc.nextLine();
		
		System.out.println("Enter option in words");
		String option = sc.nextLine();
		option = option.toUpperCase();//User input convert into Upper case.
		
		switch(option) 
		{
			case "ADD" : System.out.println("The sum of two numbers is "+ (a+b));
			break;
			
			case "SUBTRACT" : System.out.println("The answer of two numbers is "+ (a-b));
			break;
			
			case "MULTIPLY" : System.out.println("The result of two numbers is "+ (a*b));
			break;
			
			case "DIVISION" : System.out.println("The result of two numbers is "+ (a/b));
			break;
			
			case "EXIT" : System.out.println("Programe is exit");
			break;
			
			default : System.out.println("Invalid Option");
			
		
		}

	}

}
