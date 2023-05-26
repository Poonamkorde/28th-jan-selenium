package COLLECTION;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class example1_Arraylist
{
	public static void main(String[] args) 
	{
		ArrayList al= new ArrayList();
		//Arraylist is heterogenious
		al.add("Rahul");
		al.add(101);
		al.add(65.5f);
		al.add('A');
		al.add(101);//dupicate allowed
		al.add(null);
		al.add(null);//any no.of null values can be added
		
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.get(0));
		//add info in between arraylist-->left shift operation
	
		al.add(4,500);
		System.out.println(al);
		//Remove info in between arraylist-->left shift operation
		al.remove(4);
		System.out.println(al);
		
		System.out.println("-------print data using iterator cursor-------");
		
		Iterator itr=al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			
			
		}
		System.out.println("---------------print data using listiterator cursor");
		
		ListIterator litr=al.listIterator();
		while(litr.hasNext())
		{
			System.out.println(litr.next());
			
		}
		
	System.out.println("------------print data using for loop------------");
			
			for(int i=0;i<=al.size()-1;i++)
			{
				System.out.println(al.get(i));
			}
			
			System.out.println("----------print data using for each loop ");
		
		for(Object s1:al)
		{
			System.out.println(s1);
		}
		
		
		
	}

}
