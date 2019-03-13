package test3;

import java.util.Scanner;
public class CopyOf数字和为0方法数 {
	//5 15 5 5 10 2 3
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt(); 
        	int sum=sc.nextInt();
        	int a[]=new int[n];
        	for(int i=0;i<n;i++){
        		a[i]=sc.nextInt();
        	}
        	int rs=getRs(a,0,sum);
        	System.out.println(rs);
        	
        }
        sc.close();
    }

	private static int getRs(int[] a,int i, int sum) {
		int c=0;
		if(sum==0)
			return 1;
		if(i<a.length){
			return c+=getRs(a,i+1,sum)+getRs(a,i+1,sum-a[i]);
		}else{
			return c;
		}
	
	}
	
	

	
}
