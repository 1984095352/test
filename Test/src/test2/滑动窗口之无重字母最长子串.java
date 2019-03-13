package test2;

import java.util.Scanner;

public class 滑动窗口之无重字母最长子串 {
	/*
	ssffhagsegaasfsdas
	*/
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 while(sc.hasNext()){
			 String s=sc.next();
	        System.out.println(gerRs(s));
		 }
	     sc.close();
	        
	        
	}

	private static int gerRs(String s) {
		int l=0,r=-1,res=0,n=s.length();
		int times[]=new int[256];
		while(l<n){
			if(r+1<n&&times[s.charAt(r+1)]==0){
				times[s.charAt(++r)]++;
			}else{
				times[s.charAt(l++)]--;
				//从l开始找到r+1位置的元素，并将此元素之前的元素去除，同时times对应的频次减一；
				
			}
			
			res=Math.max(res, r-l+1);
		}
		return res;
	}

	
}
