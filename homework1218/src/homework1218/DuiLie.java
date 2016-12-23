package homework1218;

import java.util.*;

public class DuiLie {
     static LinkedList l=new LinkedList();
	public static void main(String[] args) {
	
		put("01");
		put("02");
		put("03");
		put("04");
		put("05");
	
		while(!notEmpty()){
				
		System.out.println(get());
		
		
		}
		
		}
public static void put(Object o){
	 l.addFirst(o);
}
public static Object get(){

	
	return l.removeLast(); // Removes and returns the last element from this list.
}
 public   static boolean notEmpty(){
	return l.isEmpty();
	   
   }

   
}
