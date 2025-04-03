package com.Lambda_Expression;

@FunctionalInterface
interface Demo
{
	void display();
}
public class Demi
{
	public static void main(String[] args) 
	{
	Demo d=()->{
	System.out.println("Welcome");	
	};
   d.display();
	}

}
