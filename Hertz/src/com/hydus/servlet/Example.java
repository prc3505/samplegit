package com.hydus.servlet;

public class Example 
{
int a,b,c;
	
	public void add(int a,int b)
	{
		c=a+b;
		System.out.println("addition value:" +c);
		
	}
	public void sub(int a,int b)
	{
		c=a-b;
		System.out.println("subtracted value:" +c);
		
	}
	public void mul(int a,int b)
	{
		c=a*b;
		System.out.println("multiplied value:" +c);
		
	}

	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		 Example sample=new  Example();
         sample.add(4, 8);
         sample.mul(9, 8);
         sample.sub(99,88);
	}

}
