package test;

import java.util.Scanner;

public class Main13 {

	/**
	密码要求:
		1.长度超过8位
		2.包括大小写字母.数字.其它符号,以上四种至少三种
		3.不能有相同长度超2的子串重复
		说明:长度超过2的子串
	 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        while (sc.hasNextLine()) {
        	String s=sc.nextLine();
        	getResult(s);
        }
        sc.close();
    
	
    }

	private static void getResult(String s) {
		int flag=0,t=1;
		if(s.length()>8){		
			char[] c=s.toCharArray();
			int p1=0,p2=0,p3=0,p4=0;
			for(int i=0;i<c.length;i++){
				if(c[i]>='A'&&c[i]<='Z')
					p1=1;
				else if(c[i]>='a'&&c[i]<='z')
					p2=1;
				else if(c[i]>='0'&&c[i]<='9')
					p3=1;
				else
					p4=1;
				for(int j=0;j<i;j++){
					if(c[j]==c[i]){
						if(i!=c.length-2&&i!=c.length-1&&c[j+1]==c[i+1]&&c[j+2]==c[i+2]){
							t=0;
							break;	
						}						
					}					
				}
			}
			int p=p1+p2+p3+p4;
			if(p>=3&&t==1){
				flag=1;
				
			}
		}
		if(flag==1){
			System.out.println("OK");
		}else{
			System.out.println("NG");
		}
	}
}
