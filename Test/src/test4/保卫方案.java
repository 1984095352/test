package test4;

import java.util.Scanner;

public class 保卫方案 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int n=sc.nextInt();
        	int a[]=new int[n];
        	for(int i=0;i<n;i++){
        		a[i]=sc.nextInt();
        	}
        	int cnt=n;
        	for(int i=0;i<n-2;i++){
        		for(int j=i+2;j<n;j++){
            		int min=Math.min(a[i], a[j]);
            		boolean b1=true,b2=true;
            		//内圈无大于min
            		for(int k=i+1;k<j;k++){
            			if(a[k]>min){
            				b1=false;
            				break;
            			}
            		}
            		//外圈无大于min
            		for(int k=j+1;k<i+n;k++){
            			if(a[k%n]>min){
            				b2=false;
            				break;
            			}
            		}
            		if(b1||b2){
            			cnt++;
            		}
            	}
        		
        	}
        	System.out.println(cnt-1);
        }
        
        sc.close();
        
        
    }
    
	
}
