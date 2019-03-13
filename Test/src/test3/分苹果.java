package test3;

import java.util.Scanner;
public class 分苹果 {
	static int min=Integer.MAX_VALUE;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int a[]=new int [n];
        	int sum=0;
        	for(int i=0;i<n;i++){
        		a[i]=sc.nextInt();
        		sum+=a[i];
        	}
        	int rs=getRs(a,n,sum/n);
        	double m=(double)sum/n;
        	if(m>sum/n)
        		System.out.println(-1);
        	else
        		System.out.println(rs);
        	
        }
        sc.close();
    }
	private static int getRs(int[] a, int n,int ave) {
		int rs=0;
		for(int i=0;i<n;i++){
			if((a[i]-ave)%2!=0){
				return -1;
			}
			a[i]=a[i]-ave;
		}
		for(int i=0;i<n;i++){
			if(a[i]>0)
			rs+=a[i]/2;
		}
		return rs;
	}

	
		
	
}
