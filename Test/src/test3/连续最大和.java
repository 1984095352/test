package test3;

import java.util.Scanner;
public class 连续最大和 {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int a[]=new int[n];
        	for(int i=0;i<n;i++){
        		a[i]=sc.nextInt();
        	}
        	int max=0;
        	int dp[]=new int [n+1];     
        	for(int i=1;i<=n;i++){
        		dp[i]=a[i-1];       		
        	}
        	for(int i=2;i<=n;i++){
        		if(dp[i-1]+a[i-1]>a[i-1]){
        			dp[i]=dp[i-1]+a[i-1]; 
        			max=max>dp[i]?max:dp[i];
        		}else {
        			dp[i]=a[i-1]; 
        			max=max>dp[i]?max:dp[i];
        		}
        	}
        	System.out.println(max);
        }
        sc.close();
    }
	
	
	
}
