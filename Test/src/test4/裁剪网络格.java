package test4;

import java.util.Arrays;
import java.util.Scanner;

public class 裁剪网络格 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	
        	int n=sc.nextInt();
        	int x[]=new int[n];
        	int y[]=new int[n];
        	for(int i=0;i<n;i++){
        		x[i]=sc.nextInt();
        		y[i]=sc.nextInt();
        	}
        	Arrays.sort(x);
        	Arrays.sort(y);
        	int maxX=x[n-1]-x[0];
        	int maxY=y[n-1]-y[0];
        	int max=maxX>maxY?maxX:maxY;
        	System.out.println(max*max);
        }
        sc.close();
        
        
    }

}
