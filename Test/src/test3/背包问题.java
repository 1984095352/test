package test3;
/*
6 3 5 4 6
2 2 6 5 4
10
*/
import java.util.Scanner;
public class 背包问题 {
	static int min=Integer.MAX_VALUE;
	static int k=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {       	
        	int p[]=new int[5];
        	for(int i=0;i<5;i++){
        		p[i]=sc.nextInt();
        	}
        	int w[]=new int[5];
        	for(int i=0;i<5;i++){
        		w[i]=sc.nextInt();
        	}
        	int n=sc.nextInt();
        	int r=getR(p,w,n);
        	System.out.println(r);
        }	
		
	}
	private static int getR(int[] p, int[] w, int n) {
		//p 价值  w  重量   n总重
		int dp[][]=new int[6][n+1];
		
		
		for(int i=1;i<=5;i++){
			for(int j=0;j<=n;j++){
				if(w[i-1]<=j)
					dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-w[i-1]]+p[i-1]);
				
				
			}
		}
		return dp[5][n];
	}
}
