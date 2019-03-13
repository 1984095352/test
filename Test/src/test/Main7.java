package test;

import java.util.Scanner;

public class Main7 {

	/**
	将一个英文语句以单词为单位逆序排放。例如“I am a boy”，逆序排放后为“boy a am I”
	所有单词之间用一个空格隔开，语句中除了英文字母外，不再包含其他字符
	 */
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
        	 String s=sc.nextLine();
        	 reverse(s);
        }       
        sc.close();
    }
	/*private static void reverse(String s) {
		String[] split=s.split("\\ ");
		int len=split.length-1;
		for(int i=0;i<len;i++){
			String t=split[i];
			split[i]=split[len];
			split[len--]=t;
		}
		for(int i=0;i<split.length-1;i++){
			if(split[i]!=null&&!(split[i].equals(""))){
				System.out.print(split[i]+" ");
			}
		}
		
		System.out.print(split[split.length-1]);
	}*/
	private static void reverse(String s) {	
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		sb.reverse();
		String[] split=sb.toString().split("\\ ");
		sb.delete(0, sb.length());
		for(int i=0;i<split.length;i++){
			StringBuffer st=new StringBuffer();
			st.append(split[i]);
			st.reverse();
			sb.append(st+" ");
		}
		sb.delete(sb.length()-1, sb.length());
		System.out.print(sb);
	}
	
	
}
