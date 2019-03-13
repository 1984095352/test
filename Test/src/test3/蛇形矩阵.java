package test3;

import java.util.Scanner;
public class 蛇形矩阵 {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int a[][]=new int[n][n];
        	for(int i=0;i<n;i++){
        		a[i][0]=i*(i+1)/2+1;        		
        	}
        	for(int j=1;j<n;j++){
        		for(int i=1;i<n-j+1;i++){        		
        			a[i-1][j]=a[i][j-1]+1;
        		}
        	}
        	System.out.println();
        }
        sc.close();
    }
	
	
	
}
