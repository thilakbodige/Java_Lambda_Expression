package com.Lambda_Expression;
import java.util.*;
public class Calculator_Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
//=============Lambda Expression=================//
//=====================ADD==================//
		Calcuator sum=(int a, int b)->
		{
			return a+b;
		};
//=====================SUB==================//
		Calcuator sub=(int a, int b)->
		{
			return a-b;
		};
//=====================Mul==================//
		Calcuator mul=(int a, int b)->
		{
			return a*b;
		};
//=====================Div==================//
		Calcuator div=(int a, int b)->
		{
			return a/b;
		};
//==================================================//
		System.out.println("Enter the Num1: ");
		int n1=sc.nextInt();
		System.out.println("Enter the Num2: ");
		int n2=sc.nextInt();
		System.out.println("Sum: "+(sum.operation(n1,n2)));
		System.out.println("Sub: "+(sub.operation(n1,n2)));
		System.out.println("Multiplication: "+(mul.operation(n1,n2)));
		System.out.println("Division: "+(div.operation(n1,n2)));
	}

}
