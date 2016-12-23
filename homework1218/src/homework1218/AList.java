package homework1218;

import java.util.ArrayList;
import java.util.List;

public class AList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List list=new ArrayList();
      for(int i=0;i<5;i++){
    	  list.add(i+1);
    	 System.out.print(list.get(i)); 
    	 
      }
      System.out.println();
      //3后增加元素

      list.add(3, 0);
      System.out.println("在3后面郑家元素：");
      for(Object o:list){
    	  System.out.print(o);
      }
      System.out.println();
     
      list.remove(2);
      System.out.println("删除3后的元素：");
      for(Object o:list){
    	  System.out.print(o);
      }
      System.out.println();
      
     System.out.println("5所在下标：  "+list.indexOf(5)); 
	}

}
