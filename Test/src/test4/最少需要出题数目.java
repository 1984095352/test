package test4;

import java.util.Arrays;
import java.util.Scanner;
/*
4  
20 35 23 40
*/
public class 最少需要出题数目 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);          
            int cnt = 0,t=0;;
            for (int i = 1; i < n ; ) {
            	
	            	if(a[i]-a[i-1]>10&&a[i]-a[i-1]<=20){
	            		/*if(i-3>=0&&a[i-1]-a[i-2]<=10&&a[i-2]-a[i-3]<=10){
	            			i+=1;
		            		if(i>=n){
		            			t=1;
		            			break;
		            		}
	            		}
	            		else*/
	            		if(i-2>=0&&a[i-1]-a[i-2]<=10){
	            			i+=1;
		            		if(i>=n){
		            			t=1;
		            			break;
		            		}
		            		cnt+=1;
	            		}else{
		            		i+=2;
		            		if(i==n){
		            			t=2;
		            			break;
		            		}else if(i==n+1){
		            			t=1;
		            			break;
		            		}
		            		cnt++;
	            		}
	            	}else if(a[i]-a[i-1]>20){
	            		i+=1;
	            		if(i>=n){
	            			t=1;
	            			break;
	            		}
	            		cnt+=2;
	            		
	            	}else{
	            		t++;
                        if((i+1+cnt)%3==0)
	            			t=0;
	            		i++;
	            	}
            	
            	
            }
            if(t==0){
            	System.out.println(cnt);
            }else
            System.out.println(cnt+3-t%3);
        }
    }
}
