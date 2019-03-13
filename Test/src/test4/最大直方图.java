package test4;

import java.util.Scanner;

public class 最大直方图 {
/*	
5
2 7 9 4 1
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	
        	int n=sc.nextInt();
        	int a[]=new int[n];
        	for(int i=0;i<n;i++){
        		a[i]=sc.nextInt();
        	}
        	int rs=countArea(a, n);
        	System.out.println(rs);
        }
        sc.close();
        
        
    }

    
        public static int countArea(int[] a, int n) {
        	int max=0;
        	for(int i=0;i<n;i++){
        		int pre=i;
        		int next=i;
        		int tmax=a[i];
        		while(pre>=0&&a[pre]>=a[i]){
        			if(pre!=i){
        				tmax+=a[i];
        			}
        			pre--;
        		}
        		while(next<n&&a[next]>=a[i]){
        			if(next!=i){
        				tmax+=a[i];
        			}
        			next++;
        		}
        		if(tmax>max){
        			max=tmax;
        		}
        	}
        	
        	
			return max;
            
        }
    
	
}
