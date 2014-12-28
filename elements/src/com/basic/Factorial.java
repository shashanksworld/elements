/*	
 * @author: shashanksworld 
 * @version: 1.1
 */
package com.basic;

// TODO: Auto-generated Javadoc
/**
 * The Class Factorial.
 */
public class Factorial {

	/** The count. */
	static int count =0;
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start the factorial by recurrsion \n\n");

		System.out.println("\n\nResult from main:  "+factorial(5));

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
	
	/**
	 * Prints the space.
	 *
	 * @param ct the ct
	 */
	static void  printSpace(int ct)
	{
		for(int i=0;i<ct;i++)
		{
			System.out.print("\t");
		}		
	}
	
	/**
	 * Factorial using recursion
	 * @info: output formatted for better understanding of cascaded calls to factorial function.
	 * @param n the n
	 * @return the int
	 */
	public static int  factorial(int n)
	{ 	int  result=0;
		
		int temp=0;
		temp=count;
			printSpace(temp);
			logger("Call "+temp +" Start ");
			count++;
			if(n==1)
				{
					printSpace(temp+1);
					System.out.println("Process call::"+temp+" Result:"+1);			
					printSpace(temp);
					logger("Call "+temp +" end ");
					return 1;
				}
				result=factorial(n-1)*n;
				printSpace(temp+1);
			System.out.println("process call::"+temp+" Result:"+result);			
			printSpace(temp);
			logger("Call "+temp +" end ");
		return result;
					
	}


}
