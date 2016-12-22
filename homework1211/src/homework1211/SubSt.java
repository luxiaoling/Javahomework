package homework1211;

import java.util.Scanner;

public class SubSt {

	public static void main(String[] args) {
		int sum=0,s=0;
		System.out.println("请输入字符串");
		Scanner sc=new Scanner(System.in);
		String st1=sc.next();
		System.out.println("请输入子字符串");
		String st2=sc.next();
		
	while(st1.indexOf(st2,s)!=-1&&s<st1.length()){
			sum+=1;
			s=st1.indexOf(st2, s)+st2.length();
		}
		
       System.out.println("出现次数："+sum);
	}

}
