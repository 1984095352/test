package test2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class 火车进站 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
            	a[i]=sc.nextInt();
            }
            List<String> rs=new ArrayList<String>();
            getRs(a,0,n-1,rs);
            Collections.sort(rs);
            for(String s:rs){
            	System.out.println(s);
            }
        }
        sc.close();
    }

	private static int getRs(int a[],int k,int m,List<String> rs) {
		
		if(k==m){
			StringBuffer sb=new StringBuffer();
			for(int i=0;i<=m-1;i++){
				sb.append(a[i]+" ");				
			}
			sb.append(a[m]);
			//System.out.println(sb.toString());
			rs.add(sb.toString());
			
		}else{
			for(int i=k;i<=m;i++){
				swap(a,k,i);
				getRs(a,k+1,m,rs);
				swap(a,k,i);
			}
		}
		return 0;
	}

	private static void swap(int[] a, int k, int i) {
		int t=a[k];
		a[k]=a[i];
		a[i]=t;
		
	}

	

	
}
