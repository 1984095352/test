package test3;

import java.util.Scanner;
public class 藏宝图 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	String s=sc.next();
        	String t=sc.next();
        	String rs=getResult(s,t);
        	System.out.println(rs);
        }
        sc.close();
    }

	private static String getResult(String s, String t) {
		int n=s.length(),m=t.length();
		int dp[][]=new int [n+1][m+1];		
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(s.charAt(i-1)==t.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+1;
				}else{
					dp[i][j]=Math.max(dp[i-1][j], dp[i][j-1]);
				}
			}
		}
		if(dp[n][m]==m)
			return "Yes";
		else
			return "No";
	}

}
