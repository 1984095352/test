package test;

import java.util.Scanner;

public class 截取字符串 {

	/**
	 * 题目描述 截取字符串 。
	 */
	

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s=sc.next();
            int n=sc.nextInt();          
            StringBuffer sb=new StringBuffer();
            for(int i=0;i<s.length();i++){
            	char cr=s.charAt(i);
                if((int)cr>255){//hanzi 
                	n-=2;
                	if(n>=2)
                	sb.append(cr);
                }
                if((int)cr>=0 && (int)cr<=255){//yingwen 
                	n-=1;
                	if(n>=0)
                	sb.append(cr);
                }
            }
            
            System.out.println(sb.toString());
           
			
        }
        sc.close();
    }

		
	
}