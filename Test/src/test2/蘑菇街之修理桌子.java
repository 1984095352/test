package test2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class 蘑菇街之修理桌子 {
/*
8
2 2 2 1 3 3 4 4 
5 2 4 2 2 5 2 3
	 */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int n=sc.nextInt();       	
        	Integer a[][]=new Integer[n][2];         	
        	for(int i=0;i<n;i++)
        		a[i][0]=sc.nextInt();
        	for(int i=0;i<n;i++){
        		a[i][1]=sc.nextInt();       	
        	}
        	System.out.println(getRs(n,a));
        }
        sc.close();
        
        
    }

	private static int getRs(int n, Integer[][] a) {
		Integer b[][]=new Integer[n][2];
		b=a.clone();
		int max=0,tocal=0;
		for(int i=0;i<n;i++)
			tocal+=a[i][1];
		Arrays.sort(a,new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				if(o1[0]!=o2[0])
					return o2[0]-o1[0];
				else
					return o2[1]-o1[1];
			}
		});
		Arrays.sort(b,new Comparator<Integer[]>() {
			@Override
			public int compare(Integer[] o1, Integer[] o2) {
				
					return o2[1]-o1[1];
			}
		});
		for(int i=0;i<n-1;){
			int tmp=a[i][0],c=0,tmax=a[i][1];
			while(i+1<n&&a[++i][0]==tmp){
				c++;
				tmax+=a[i][1];
			}
			if(a[i][0]==tmp){
				c++;
				tmax+=a[i][1];
			}
			for(int j=0;j<n;j++){
				//在b中从0到n找c-1个最大的
				if(b[j][0]<tmp&&c>0){
					tmax+=b[j][1];
					c--;
				}				
			}
			if(tmax>max){
				max=tmax;
				//System.out.println(tmp);
			}
		}
		return tocal-max;
	}

	

	

	
}
