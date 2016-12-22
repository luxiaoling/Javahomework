package homework1211;

public class Mult {

	public static void main(String[] args) {
	
      outMult();
	}
	static void outMult(){
		for (int i = 1;  i <= 10; i++){       
			for(int j= 1;j<= i;j++){ 
				System.out.print(i+"*"+j+"="+j*i+" , ");
		}    
			System.out.println();   
		}
	}

}
