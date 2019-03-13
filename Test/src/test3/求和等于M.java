package test3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class 求和等于M {
	static int max=Integer.MIN_VALUE;
	static List<Integer> list=new ArrayList<Integer>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        dfs(1,n,0,m);
    }
	private static void dfs(int i, int n,int sum, int m) {
		if(sum==m){
			for(int j=0;j<list.size()-1;j++){
				System.out.print(list.get(j)+" ");
			}
			System.out.println(list.get(list.size()-1));
			return;
		}
		if(sum>m){
			return;
		}
		for(int j=i;j<=n;j++){
			list.add(j);
			dfs(j+1,n,sum+j,m);
			list.remove(list.size()-1);
		}
	}
}
