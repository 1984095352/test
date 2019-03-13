package test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class 跳石版 {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	
        	System.out.println(getRs(n,m));
        }
        sc.close();
    }
	private static int getRs(int n,int m) {

		int d[]=new int[m+1];
		for(int i=n+1;i<=m;i++){
			d[i]=Integer.MAX_VALUE;
		}
		
		for(int i=n;i<=m;i++){
			
			if(d[i]==Integer.MAX_VALUE) continue;
			List<Integer> all=new ArrayList<Integer>();
			all=getAll(i);
			for(int j=0;j<all.size();j++){
				int t=all.get(j)+i;
				if(t<=m&&d[t]>d[i]+1)
					d[t]=d[i]+1;
			}
		}
		return d[m];		
	}
	private static List<Integer>  getAll(int m) {
		List<Integer> all=new ArrayList<Integer>();
		
		for(int i=2;i<=Math.sqrt(m);i++){
			if(m%i==0){
				all.add(i);
				if(i!=m/i)
					all.add(m/i);
			}
				
		}
		
		return all;
		
		
	}
	
	
}
