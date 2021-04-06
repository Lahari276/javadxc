package collections;
import java.util.*;  
public class LinkedList1 {
	public static void main(String[] args) {
		
	
	LinkedList<String> al=new LinkedList<String>();  
	  al.add("Ravi");  
	  al.add("Ram");  
	  al.add("Rama");  
	  al.add("Raja");  
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	}
}