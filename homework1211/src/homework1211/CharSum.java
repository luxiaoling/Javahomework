package homework1211;

public class CharSum {

	public static void main(String[] args) {
	hhh("你好Hello222");

	}
	static void hhh(String st){
	    
		 int egsum=0,cnsum=0,intesum=0;
		for(int i=0;i<st.length();i++){
		    char ch=st.charAt(i);
		    
			if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')) {
				egsum+=1;
			}else if('0'<=ch&&ch<='9'){
				intesum+=1;
			}else 
				cnsum+=1;
		}
		
		System.out.println("中文字符："+cnsum+"  英文字符："+egsum+"   数字字符："+intesum);
	}

}
