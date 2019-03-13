package test4;

import java.util.Scanner;

public class 拼多多数三角形 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int n=sc.nextInt();
        	int a[][]=new int [n][2];
        	for(int i=0;i<n;i++){
        		a[i][0]=sc.nextInt();
        		a[i][1]=sc.nextInt();
        	}
        	int c=0;
        	for(int i=0;i<n;i++){
        		for(int j=0;j<n;j++){
        			for(int k=0;k<n;k++){
        				if((a[i][1]-a[j][1])!=0&&(a[i][1]-a[k][1])!=0){
	                		if((double)((double)(a[i][0]-a[j][0])/(double)(a[i][1]-a[j][1]))!=(double)((double)(a[i][0]-a[k][0])/(double)(a[i][1]-a[k][1]))){
	                			c++;
	                		}
        				}else if((a[j][1]-a[i][1])!=0&&(a[j][1]-a[k][1])!=0){
        					if((double)((double)(a[j][0]-a[i][0])/(double)(a[j][1]-a[i][1]))!=(double)((double)(a[j][0]-a[k][0])/(double)(a[j][1]-a[k][1]))){
	                			c++;
	                		}
        				}else if((a[k][1]-a[i][1])!=0&&(a[k][1]-a[j][1])!=0){
        					if((double)((double)(a[k][0]-a[i][0])/(double)(a[k][1]-a[i][1]))!=(double)((double)(a[k][0]-a[j][0])/(double)(a[k][1]-a[j][1]))){
	                			c++;
	                		}
        				}
                	}
            	}
        	}
        	
        	System.out.println(c/6);
        	System.out.println((double)((double)1/(double)2));
        }
        
        sc.close();
        
        
    }


	
}
