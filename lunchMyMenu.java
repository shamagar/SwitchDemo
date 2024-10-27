package com.switchCaseDemo;

import java.util.Scanner;

public class lunchMyMenu 
{

	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);

		System.out.println("Open");
		System.out.println("New");
		System.out.println("Close");
		System.out.println("Save");
		System.out.println("Exit");
		
		System.out.println("*****************");
		System.out.println("Choose one of the options given above:");
		String option = scan.nextLine();
		
		switch(option)
		{
			case "Open" : System.out.println("My menu is open");
			break;
			
			case "New" : System.out.println("New File Created.");
			break;
			
			case "Close" : System.out.println("File Closed.");
			break;
			
			case "Save" : System.out.println("File Saved");
			break;
			
			case "Exit" : System.out.println("Exit Page");
			break;
			
			default: System.out.println("Invalid Input");
			
		}

	}

}
