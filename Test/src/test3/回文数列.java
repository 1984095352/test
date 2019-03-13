package test3;

import java.util.Scanner;
public class 回文数列 {
	//4 1 1 1 3

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int a[]=new int[n];
        	for(int i=0;i<n;i++){
        		a[i]=sc.nextInt();
        	}
        	System.out.println(getRs(a,0,n-1));
        }
        sc.close();
    }
	private static int getRs(int[] a, int st, int end) {
		int count=0;
		int left=a[st],right=a[end];
		while(st<end&&left!=right){
			if(left<right){
				left+=a[++st];
				count++;
			}else{
				right+=a[--end];
				count++;
			}
		}
		if(st>=end){	
			return count;
		}else{
			return count += getRs(a, st+1, end-1);
		}
		
				
	}
	
	
}
