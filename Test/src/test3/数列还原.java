package test3;

import java.util.Scanner;
public class 数列还原 {
	static int nn=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	int a[]=new int[n];
        	int b[]=new int[n];
        	for(int i=0;i<n;i++){
        		a[i]=sc.nextInt();
        	}
        	for(int i=0;i<n;i++){
        		b[i]=i+1;
        	}
        	int rs=getRs(a,b,n,m);
        	System.out.println(rs);
        }
        sc.close();
    }

	private static int getRs(int[] a,int[] b, int n, int m) {
		int rs=0;
		rs=allSort(a,b,0,n-1,m);
		return rs;
	}

	private static int  allSort(int[] a,int[] b, int i, int j,int m) {
		
		if(i==j){
			if(sorted(b)==m&&bool(a,b)){
				nn++;
			}
		}else{
			for(int c=i;c<=j;c++){
				swap(b,i,c);
				allSort(a,b, i+1, j, m) ;
				swap(b,i,c);
			}
			
			
		}
		return nn;
	}

	private static boolean bool(int[] a, int[] b) {
		for(int i=0;i<a.length;i++){			
				if(a[i]!=b[i]&&a[i]>0){
					
					return false;
				}			
		}
		return true;
	}

	private static void swap(int[] a, int i, int b) {
		int temp=a[i];
		a[i]=a[b];
		a[b]=temp;
		
	}

	private static int sorted(int[] a) {
		int rs=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<i;j++){
				if(a[j]<a[i])
					rs++;
			}
		}
		return rs;
	}

	
}
