package test3;

import java.util.Scanner;
public class 数字和为0方法数 {
	//5 15 5 5 10 2 3
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt(); 
        	int sum=sc.nextInt();
        	int a[]=new int[n+1];
        	for(int i=1;i<=n;i++){
        		a[i]=sc.nextInt();
        	}
        	int rs=getRs(a,sum);
        	System.out.println(rs);
        	
        }
        sc.close();
    }

	private static int getRs(int[] a, int sum) {
		int dp[][]=new int[a.length][sum+1];//dp[i][j]表示前i组数组成j的方法数
		for (int i = 0 ; i < a.length ;i++)
	    {
	        dp[i][0] = 1;
	    }
		for (int j = 1 ; j < sum ;j++)
	    {
	        dp[0][j] = 0;
	    }
		//dp[1][a[0]]=1;
		for(int i=1;i<a.length;i++){
			for(int j=0;j<=sum;j++){
				if(a[i]<=j){
					dp[i][j]=dp[i-1][j]+dp[i-1][j-a[i]];
				}else{
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[a.length-1][sum];
	}
	
	

	
}
