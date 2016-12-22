package homework1211;

public class Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String  mail="12251ttt4@qq.com";
   boolean a= panduan1(mail);
   if(a){
	   System.out.println("邮箱验证通过");
	   System.out.println("用户名："+mail.substring(0, mail.indexOf('@')));
	   System.out.println("网站域名："+mail.substring(mail.indexOf('@')+1));
	   }
   else
	   System.out.println("邮箱不通过");
	}
  public static boolean panduan1(String mail){
	 
	  
	  
	  if(mail.indexOf("@")==-1||mail.indexOf(".")==-1){
		
		 
		   return false;
	  }
	  if(mail.indexOf("@")!=mail.lastIndexOf("@")||mail.indexOf(".")!=mail.lastIndexOf(".")){
		 
	 ; return false;
	  }
	  if(mail.indexOf(".")<mail.indexOf("@")){
			return false;
	  }
	  char ch[]=mail.toCharArray();
	  for(int i=0; i<mail.indexOf("@"); i++) {
			if((mail.charAt(i)>='A'&&mail.charAt(i)<='Z')||(mail.charAt(i)>='a'&&mail.charAt(i)<='z')||(mail.charAt(i)>='0'&&mail.charAt(i)<='9')) 
			{
				
				return true;
			}
			else
				return false;
		}
	  
		 return true;
  }
 
}
