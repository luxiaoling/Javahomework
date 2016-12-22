package homework1211;

import java.util.Scanner;

public class Insert {
     
	public static void main(String[] args) {
		String st1="1234567";
		System.out.println(st1);
	
	    System.out.println("要插入位置和字符：");
		Scanner sc=new Scanner(System.in);
        int weizhi=sc.nextInt();
        String st2=sc.next();
        
        StringBuffer strb1=new StringBuffer();
        strb1.append(st1);
        StringBuffer strb2 =strb1.insert(weizhi ,st2);
        System.out.println(strb2);
}
}