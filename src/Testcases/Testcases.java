package Testcases;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.rules.ExpectedException;

import DataStructure.BinarySearch;

public class Testcases {
	
	@Test
	public void checkBinarySearch()
	{
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<4;i++)
		{
			list.add(i);
		}
		
		int output = BinarySearch.binarySearch(list,2,0,list.size()-1);
		
		int expactedoutput = 2;
		
		if(output == expactedoutput)
		{
			System.out.println("binary search method checked successfully");
			
		}
	}

}
