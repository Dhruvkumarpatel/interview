package sorting;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	
	public static void main(String args[]) throws ParseException
	{  
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

		Person p = new Person(1,"dhruv","patel", (java.util.Date) dateFormat.parse("05-11-1993"),"male");
		Person p1 = new Person(2,"jay","patel",(java.util.Date) dateFormat.parse("06-12-1993"),"male");
		Person p2 = new Person(3,"aneri","patel",(java.util.Date) dateFormat.parse("07-13-1993"),"female");
		Person p3 = new Person(4,"utkarshani","patel",(java.util.Date) dateFormat.parse("08-14-1993"),"female");
		Person p4 = new Person(5,"yong","patel",(java.util.Date) dateFormat.parse("09-15-1993"),"male");
		
		TreeMap<Integer,Person> map = new TreeMap<Integer,Person>();
		map.put(p.getPerson_id(),p);
		map.put(p1.getPerson_id(),p1);
		map.put(p2.getPerson_id(),p2);
		map.put(p3.getPerson_id(),p3);
		map.put(p4.getPerson_id(),p4);
		
		Scanner o = new Scanner(System.in);
		
		System.out.println("enter person id");
		
		int enter = o.nextInt();
		
		for(Map.Entry m : map.entrySet())
		{
			
			if((int) m.getKey() == enter)
			{
				Person person = (Person) m.getValue();
				
				System.out.println("fName :"+person.getfName());
				System.out.println("lName :"+person.getlName());
				System.out.println("Birthdate :"+person.getBirthDate().toString());
				System.out.println("Gender :"+person.getGender());
				
			}
		}
		
	}

}
