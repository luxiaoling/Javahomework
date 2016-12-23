package homework1218;

import java.util.HashSet;

public class HSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashSet h=new HashSet();
      h.add(new Student("张一"));
      h.add(new Student("张二"));
      h.add(new Student("张三"));
      h.add(new Student("张四"));
      h.add(new Student("张五"));
      h.add(new Student("张五"));
   
    System.out.println(h.toString()); 
     
      
	}

}
class Student extends Object{
	String name;
    Student(String name){
    	this.name=name;
    }
	public String getName() {
		return name;
	}

	public boolean  equals(Object obj){    //equals()重写
		if(obj instanceof Student){
			Student stu=(Student) obj;
			
			if(this.name.equals(stu.name)){
				return true;
			}else
				return false;
		}else 
		 return super.equals(obj);
	}
	public int hashCode(){      //hashCode()重写
		return name.hashCode();
	}
	public String toString(){
		return this.name;
		
	}
}
