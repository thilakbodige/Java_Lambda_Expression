package com.Lambda_Expression;
import java.util.*;
public class Addition_Main 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Additionsum s=(int a,int b)->
		{
		System.out.println("sum is:"+(a+b));	
		};
		System.out.println("Enter the First Number");
		int a1=sc.nextInt();
		System.out.println("Enter the Second Number");
		int b1=sc.nextInt();
		s.add(a1, b1);

	}

}
//==================Method2==================//
//public class Addition_Main 
//{
	//public static void main(String[] args)
	//{
		//Scanner sc=new Scanner(System.in);
		//Additionsum s=(int a,int b)->
		//{
		//return a+b;	
		//};
        //System.out.println("Enter the First Number");
        //int a1=sc.nextInt();
        //System.out.println("Enter the Second Number");
        //int b1=sc.nextInt();
        //int result =s.add(a1, b1); 
        //System.out.println("sum is:"+(a+b));
        //}
    //}
