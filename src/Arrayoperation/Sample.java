package Arrayoperation;

import java.util.Scanner;

public class Sample {

	public static void main(String args[]) {

		boolean flag = false;
		
		Scanner o = new Scanner(System.in);

		System.out.println("Insert Array Elements");

		int array[] = new int[5];
		
		int lengthofarray = array.length;

		for (int k = 0; k < 5; k++) {
			
			array[k] = o.nextInt();

		}
 
		System.out.println("Choose number for array operation :1) insertion, 2) deletion, 3) search, 4)update");

		int choice = o.nextInt();

		switch (choice) {
		case 1:
			// insertion
			
			System.out.println("Enter the element and index where one want to insert");
			
			int item = o.nextInt();
			
			int index = o.nextInt();
			
			
			for(int m=0;m<lengthofarray;m++)
			{
				if(m == index)
				{
					for(int h=lengthofarray;h>m;h--)
					{
						array[h+1] = array[h-1];
						
					}
					break;
				}
				
			}
			
			array[index] = item;
			
			
			for(int l=0;l<lengthofarray+1;l++)
			{
				System.out.println(array[l]);
			}
			
			break;

		case 2:
			// deletion

			System.out.println("Enter the element you want to delete");
			
			int temp = o.nextInt();
			
			for(int k=0;k<array.length-1;k++)
			{
				if(array[k] == temp)
				{
					array[k] = array[k+1];
					
					System.out.println("inside deletion :"+array[k]);
					
					flag = true;
					
				}
				
				if(flag == true)
				{
					array[k] = array[k+1];
					
					System.out.println("inside deletion :"+array[k]);
				}
				
			}
			
			lengthofarray = lengthofarray - 1;
			
			System.out.println("After Delete");
			
			for(int l=0;l<lengthofarray;l++)
			{
				System.out.println(array[l]);
			}
			
			System.out.println();
			
			
			break;

		case 3:
			// search
			
			System.out.println("Enter the element you want to search");
			
			int d = o.nextInt();
			
			for(int j=0;j<array.length;j++)
			{
				if(array[j] == d)
				{
					System.out.println(d + " is in position "+j+" in array");
					
					flag = true;
				}
			}
			
			if(flag == false)
			{
				System.out.println("Element not present in the array");
			}
				
			
			
			break;

		case 4:
			// update
			
			System.out.println("Enter the element and index for updation");
			
			int updateitem = o.nextInt();
			
			int updatedindex = o.nextInt();
			
			for(int u=0;u<lengthofarray;u++)
			{
				if(u == updatedindex)
				{
					array[u] = updateitem;
				}
			}
			
			System.out.println("After Update");
			
			for(int l=0;l<lengthofarray;l++)
			{
				System.out.println(array[l]);
			}
			
			
			break;

		default:
			break;
		}

	}

}
