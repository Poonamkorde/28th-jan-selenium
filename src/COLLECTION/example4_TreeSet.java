package COLLECTION;

import java.util.Iterator;
import java.util.TreeSet;

import org.openqa.selenium.devtools.v109.network.model.Initiator;

public class example4_TreeSet
{
	public static void main(String[] args) 
	{
		TreeSet tr=new TreeSet();
		tr.add(101);
		tr.add(104);
		tr.add(102);
		tr.add(103);
		tr.add(105);
		tr.add(107);
		tr.add(106);
		
		System.out.println(tr);
        System.out.println(tr.size());
        System.out.println(tr.isEmpty());
        tr.remove(101);
        System.out.println(tr);
      
        System.out.println(tr.first());
        System.out.println(tr.last());
        
        tr.pollFirst();
        System.out.println(tr);
        tr.pollLast();
        System.out.println(tr); 
        
        Iterator itr= tr.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        	System.out.println("-------------");
        	
        	for(Object s1:tr)
        	{
        		System.out.println(s1);
        		
        	}
        	
        	
        	
        	
        	
        	
        }
        
        
	}
	

}
