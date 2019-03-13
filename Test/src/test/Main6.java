package test;

import java.util.Scanner;

public class Main6 {

	/**
	 * 输入一个整数，将这个整数以字符串的形式逆序输出

		程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
	 * @param args
	 */
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=String.valueOf(n);
        if(s.charAt(0)=='-'){
        	s=s.substring(1,s.length());
        }
       // System.out.println(s);
        char[] c=s.toCharArray();
        reverse(c);
        String out=String.valueOf(c);
        System.out.println(out);
        sc.close();
    }

	private static void reverse(char[] c) {
		int len=c.length-1;
		for(int i=0;i<c.length/2;i++){
			char t=c[i];
			c[i]=c[len];
			c[len]=t;
			len--;
		}
		
	}
	 
	
	
}
