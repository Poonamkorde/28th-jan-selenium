package COLLECTION;

import java.util.ArrayList;
import java.util.HashSet;

public class example2_hashset 
{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		al.add("rahul");
		al.add(101);
		al.add(65.5f);
		al.add('A');
		al.add(101);
		al.add(101);
		al.add(null);
		al.add(null);
		System.out.println(al);
		
		HashSet hs=new HashSet(al);
		System.out.println(hs);
		
	}

}
