package homework1211;

public class PrintObject extends Player{

	public static void main(String[] args) {
	
	while(a<=11){
		new Player();
		System.out.println("创建了一个对象");
		
	}
	if(a>11)
     System.out.println("不能再创建对象");
	}

}
class Player{
	public static int a=1;
	Player(){
		a+=1;
		
	}
}
