package homework1211;

interface Huiwen2{                                  // 接口判断回文
	public boolean isHuiwen(String s);
}
class HuiWen3 implements Huiwen2{
	public boolean isHuiwen(String s){
    	char a[]=s.toCharArray();
    	int i,n;
    	boolean huiwen=true;
    	n=s.length();
    	for(i=0;i<n/2;i++){
    		if(a[i]!=a[n-i-1]){
    			huiwen=false;break;
    		}
    	}
    	if(huiwen)
    		return true;
    	else
    		return false;
    }
}
public class HuiWen{
    
	public static void main(String[] args) {
		
     HuiWen3 obj=new HuiWen3();
     String str="133441";
     boolean a=obj.isHuiwen(str);
     if(a)
    	 System.out.println("是回文");
     else
    	 System.out.println("不是回文");
	}

}
