/*
 * 
 */
package com.basic;

/**
 * The Class Fibonacci.
 */
public class Fibonacci {
	static int limit=20;
	static int i=0;
	static int j=1;
	public static void main(String[] args)
	{
		generator(i,j);
	}
	
	/**
	 * Generator.
	 *
	 * @param i the i
	 * @param j the j
	 * @return the int
	 */
	public static int generator(int i, int j)
	{
		if(i>=limit)
			return i;
		
		System.out.println(i);
		int temp=i;
		i=j;
		j=temp+j;
			generator(i,j);
		return 0;
	}
	
	/**
	 * Prints the space.
	 *
	 * @param ct the total not for tab space to be added
	 */
	static void  printSpace(int ct)
	{
		for(int i=0;i<ct;i++)
		{
			System.out.print("\t");
		}		
	}
	
	
}
