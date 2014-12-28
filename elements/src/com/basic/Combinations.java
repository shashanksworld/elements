package com.basic;

import java.util.*;
public class Combinations {
	
	public void setList(int data[])
	{
		
	}
	public void setList(String data[])
	{
		
	}
	public void setList(ArrayList data)
	{
		
	}
	
	public void generator(String s[], int size)
	{
		String temp[]=new String[s.length*3];
		int k=0;
		for(int i=0;i<s.length;i++)
		{		for(int j=0;j<s.length;j++)
				{
					if(i!=j)
					{
						temp[k]=s[i]+","+s[j];
						k++;
					}
					
					
				}
			
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
		
	}
	public void generatorR(String s[], int size)
	{
		String temp[]=new String[s.length*3];
		int k=0;
		for(int i=0;i<s.length;i++)
		{		for(int j=0;j<s.length;j++)
				{
					if(i!=j)
					{
						temp[k]=s[i]+","+s[j];
						k++;
					}
					
					
				}
			
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
		
	}
	public String createString(String []data)
	{
		String elements="";
		for(int i=0;i<data.length;i++)
		{
				elements+=data[i];
				if(i!=data.length-1)
				{
					elements+=",";
				}
					
		}
		return elements;
		
	}
	public static void main(String args[])
	{
		
		String[] data={"A","B","C","D"};
		
		Combinations c= new Combinations();
		String dataString="";
		c.createString(data);
		
		c.generator(data,2);
		
		
	}
	
}
