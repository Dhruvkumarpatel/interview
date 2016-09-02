package DataStructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BubbleSort {
	
	public static void main(String args[]) throws IOException
	{
		
		int array[] = new int[4];
		
		int temp;
		
		
		boolean interchange = false;
		
		Scanner o = new Scanner(System.in);
		
		
		System.out.println("Enter the elements for sorting");
		
		for(int i=0;i<array.length;i++)
		{
			array[i] = o.nextInt();
		}
		
		System.out.println("choose 1 for ascending and 2 for descending");
		
		int choice = o.nextInt();
		
		switch (choice) {
		case 1:
		
			
		for(int k=0;k<array.length-1;k++)
		{

			for(int j=0;j<array.length-1;j++)
			{
				if(array[j] > array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					
					interchange = true;
				}
				
			}
			
			if(interchange == false)
			{
				break;
			}
			
			
			
		}
			
			System.out.println("array element after sorting count = ");

			for(int i=0;i<array.length;i++)
			{
			
				System.out.println(array[i]);
				
			}
			
			break;
			
		case 2:
			
			
			
	  for(int k=0;k<array.length-1;k++)
	   {
			for(int j=0;j<array.length-1;j++)
			{
				if(array[j] <  array[j+1])
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
				
			}
	   }	
			System.out.println("array element after sorting ");

			for(int i=0;i<array.length;i++)
			{
			
				System.out.println(array[i]);
				
			}
			
			
			
			break;

		default:
			break;
		}
		
		
		
		
		
	}

}
