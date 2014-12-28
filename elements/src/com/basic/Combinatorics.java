package com.basic;

public class Combinatorics {
static int count =0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] data={"A","B","C","D"};
		
		Combinatorics cm= new Combinatorics();
		String []result =cm.getAllLists(data, 4);
		
	}
	static void logger(String info)
	{
		System.out.println(info);	
	}
	static void  printSpace(int ct)
	{
		for(int i=0;i<ct;i++)
		{
			System.out.print("\t");
		}		
	}
	public static String[] getAllLists(String[] elements, int lengthOfList)
	{
		count ++;
		logger("call "+count+" starts for length of list"+lengthOfList);

	    String[] allLists = new String[(int)Math.pow(elements.length, lengthOfList)];


	    if(lengthOfList == 1) {
	    		printSpace(count);
	    		logger("step"+count);
	    		logger("call "+count+" ends");
		    	return elements;
	    	} 
	    else
	    {	

	        String[] allSublists = getAllLists(elements, lengthOfList - 1);
	        
	        //append the sublists to each element
	        int arrayIndex = 0;
	        	        for(int i = 0; i < elements.length; i++)
	        {
	            for(int j = 0; j < allSublists.length; j++)
	            {   allLists[arrayIndex] = elements[i] + allSublists[j];
	                printSpace(count);
	                logger(allLists[arrayIndex]);
	                arrayIndex++;
	            }
	        }
	        logger("call "+count+" ends");
	        return allLists;
	    }
	}

}
