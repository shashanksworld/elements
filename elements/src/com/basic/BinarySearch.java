package com.basic;

// TODO: Auto-generated Javadoc
/**
 * The Class BinarySearch.
 */
public class BinarySearch {

	/**
	 * The main method.
	 *
	 * @param arg the arguments
	 */
	public static void main(String arg[])
	{
		int arr[]={1,2,3,4,5,6,7,8,9};
		logger("value found at  :"+ search(7,arr));
	}
	
	/**
	 * Search Binary: Search Iterative
	 *
	 * @param target the target
	 * @param a the a
	 * @return the int
	 */
	public static int search(int target, int a[])
	{
		logger("target value is :"+target);

		int min =0;
		int max=a.length-1;
		int guess=0;
		
		
		while(min<=max)
		{
			guess=min + (max - min) / 2;
			
			
			if(target<a[guess])
			{
				max=guess-1;
			
			}
			else if(target>a[guess])
			{
				min=guess+1;
			
			}else
			{
				return guess;
			}
			
		}	
		return -1;

	}
	
	/**
	 * Logger.
	 *
	 * @param info the info
	 */
	static void logger(String info)
	{
		System.out.println(info);	
	} 
}
