package com.Lambda_Expression;
import java.util.*;
public class Even_main 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
//==================Lambda Expression==================//
	Even_Check e=(int a)->
	{
	 if(a%2==0)	
	 {
		 System.out.println("It is Even");
	 }
	 else
	 {
		 System.out.println("It is Odd");
	 }
	};
     System.out.println("Enter the Number");
     int num=sc.nextInt();
     e.check(num);
	}

}
