package test2;

import java.util.Scanner;

public class 最长回文子序列 {

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
		int dp[][]=new int [c.length+1][c.length+1];
		for(int i=1;i<=c.length;i++){
			dp[i][i]=1;
			for(int j=1;j<i;j++){
				if(c[i-1]==c[j-1]){
					dp[j][i]=dp[j+1][i-1]+2;
				}else{
					dp[j][i]=Math.max(dp[j+1][i], dp[j][i-1]);
				}
			}
		}
		return dp[1][c.length];
	}

	
}
