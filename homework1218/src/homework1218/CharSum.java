package homework1218;

public class CharSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String str="HelKK年你1225";
      sum1(str);
      sum2(str);
      sum3(str);
	}
	//方法1
	public static void sum1(String st){
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
	//方法2
	public static void sum2(String st){
		int egsum=0,cnsum=0,intesum=0;
		char ch[]=st.toCharArray();
		for(char c:ch){
			if(Character.isUpperCase(c)||Character.isLowerCase(c))
				egsum++;
			else if(Character.isDigit(c))
				intesum++;
			else
				cnsum++;
		}
		System.out.println("中文字符："+cnsum+"  英文字符："+egsum+"   数字字符："+intesum);
	}
	
	//方法3
	
	public static void sum3(String st){
		int egsum=0,cnsum=0,intesum=0;
		String shu="0123456789";
		String yingwen="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWSYZ";
		for(int i=0;i<st.length();i++){
			char c=st.charAt(i);
			if(shu.indexOf(c)!=-1)
			intesum++;
			else if(yingwen.indexOf(c)!=-1)
				egsum++;
			else
				cnsum++;
			
		}
		System.out.println("中文字符："+cnsum+"  英文字符："+egsum+"   数字字符："+intesum);
	}

}
