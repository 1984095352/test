package test;

import java.util.Scanner;

public class 最长回文子串长度 {

	/**
	 * 题目描述 最大的回文串长度。
	 */
	

    	public static void main(String args[]){
			Scanner sc=new Scanner(System.in);
			while(sc.hasNext()){
				String str=sc.nextLine();
				char[] c=str.toCharArray();
				int n=getN(c);
				System.out.println(n);
			}
			sc.close();

    	}

		private static int getN(char[] c) {
			int max=Integer.MIN_VALUE;
			int[][] dp=new int[c.length][c.length];
			for(int i=0;i<c.length;i++){	
				for(int j=0;j<=i;j++){
					if(i-j<2){
						if(c[i]==c[j]){
							dp[i][j]=1;
							max=(i-j)>max?(i-j):max;
						}else{
							dp[i][j]=0;
						}
					}
					else{
						if(c[i]==c[j]){
							dp[i][j]=dp[i-1][j+1];
							if(dp[i][j]==1)
							max=(i-j)>max?(i-j):max;
						}
						else{
							dp[i][j]=0;
							
						}
					}
				}
			}
			
			
			return max+1;
		}
}