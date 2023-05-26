package COLLECTION;

import java.util.ArrayList;


public class example6_generic2
{
	public static void main(String[] args)
	{
		
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("rahul");
		al.add("ramesh");
		al.add("suresh");
		//al.add(101);
		
		for(String s1:al)
		{
			System.out.println(s1);
		}
		
		
	}

}
