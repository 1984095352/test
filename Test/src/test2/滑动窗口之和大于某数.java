package test2;

import java.util.Scanner;
import java.util.Vector;

public class 滑动窗口之和大于某数 {
	/*
	6
	2 3 1 2 4 3
	7
	求连续子数组和大于某数的最小长度
	*/
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 while(sc.hasNext()){
			 int n=sc.nextInt();
			 Vector<Integer> num=new Vector<>();
			 for(int i=0;i<n;i++){
		        	num.add(sc.nextInt());	 	        	
			 }
	        int s=sc.nextInt();
	        System.out.println(gerRs(n,num,s));
		 }
	     sc.close();
	        
	        
	}

	private static int gerRs(int n, Vector<Integer> num, int s) {
		int l=0,r=-1,res=n+1;
		int c=0;
		while(l<n){
			if(c<s&&r+1<n){
				c+=num.get(++r);
			}else{
				c-=num.get(l++);
				//如果将res=Math.min(res, r-l+1);放到这里
				//会出现bug：当c>=s时执行l++后，c或将不再大于等于s了，此时res也就比正确答案更少了。
			}
			if(c>=s)
			res=Math.min(res, r-l+1);
		}
		return res;
	}

	
}
