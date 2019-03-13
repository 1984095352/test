package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main20 {

	/**
	输入描述:
		先输入字典中单词的个数，再输入n个单词作为字典单词。
		输入一个单词，查找其在字典中兄弟单词的个数
		再输入数字n
		
		输出描述:
		根据输入，输出查找到的兄弟单词的个数
	 */  
	   public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        List<String> l=new ArrayList<String>();
	       // while (sc.hasNext()){
	        	int n=sc.nextInt();
	        	for(int i=0;i<n;i++){
	        		l.add(sc.next());
	        	}
	        	String s=sc.next();
	        	int index=sc.nextInt();
	        	int m=0;
	        	List<String> v=new ArrayList<String>();
	        	for(int i=0;i<l.size();i++){
	        		if(isTrue(l.get(i),s)){
	        			m++;
	        			v.add(l.get(i));
	        		}
	        	}
	        	System.out.print(m+" "+v.get(index-1));

	       // }
	    }

	private static boolean isTrue(String l, String s) {
		if(l.equals(s)){
			return false;
		}else if(l.length()!=s.length()){
			return false;
		}else{
			char[] c1=l.toCharArray();
			char[] c2=s.toCharArray();
			int[] a1=new int[26];
			int[] a2=new int[26];
			for(int i=0;i<26;i++){
				char c=(char) (i+'a');
				for(int j=0;j<c1.length;j++){
					if(c==c1[j])
						a1[i]++;
				}
				for(int j=0;j<c2.length;j++){
					if(c==c2[j])
						a2[i]++;
				}
			}
			for(int i=0;i<26;i++){
				if(a1[i]!=a2[i]){
					return false;
				}
			}
			return true;
		}				
	}
	    
	   
	 
	
}
