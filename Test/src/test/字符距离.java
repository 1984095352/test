package test;

import java.util.Scanner;

public class 字符距离 {

	/**
	 * 题目描述 截取字符串 。
	 */
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String s1=sc.next();
            String s2=sc.next();          
            int n=calStringDistance(s1,s2);
            System.out.println(n);
           
			
        }
        sc.close();
    }

	public  static  int  calStringDistance (String charA, String  charB){
		int n=charA.length();
		int m=charB.length();
		int [][]dp=new int[n+1][m+1];
		dp[0][0]=0;
		for(int i=1;i<=n;i++){			
			dp[i][0]=i;													
		}
		for(int i=1;i<=m;i++){			
			dp[0][i]=i;													
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(charA.charAt(i-1)==charB.charAt(j-1)){
					dp[i][j]=Math.min(Math.min(dp[i-1][j]+1, dp[i][j-1]+1), dp[i-1][j-1]);
				}else{
					dp[i][j]=Math.min(Math.min(dp[i-1][j]+1, dp[i][j-1]+1), dp[i-1][j-1]+1);
				}
			}
		}
		return dp[n][m];
	}  

			
}