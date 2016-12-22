package homework1211;

public class CaiPiao {

	public static void main(String[] args) {
		for(int j=1;j<=5;j++){
		System.out.println("第"+j+"次生成7个随机数：");
		for(int i=1;i<=7;i++){
		System.out.print((int)Math.ceil(Math.random()*35)+"  "); 
		}
		System.out.println();

		}
	}

}
