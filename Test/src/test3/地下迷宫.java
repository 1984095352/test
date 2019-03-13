package test3;

import java.util.Scanner;
import java.util.Stack;
public class 地下迷宫 {
	/*
4 4 10 
1 0 0 1
1 1 0 1 
0 1 1 1 
0 0 1 1
	 */
	static int min=Integer.MAX_VALUE;
	static int k=4;
	static int flag=0;
	static int[][] next={{0,1},{-1,0},{1,0},{0,-1}};
	static Stack<String> st=new Stack<String>();
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	int p=sc.nextInt();
        	int [][] a=new int[n][m];        	
        	for(int i=0;i<n;i++){      		
        		for(int j=0;j<m;j++){
        			a[i][j]=sc.nextInt();
        		}
        	}       	
        	boolean [][] b=new boolean[n][m]; 
        	st.push("["+0+","+0+"]");
        	
        	dfs(a,0,0,b,0,p);
        	if(min>p)
        		System.out.println("Can not escape!");
        }
        sc.close();
    }

	
	private static void dfs(int[][] a, int x, int y, boolean[][] b, int p,int all) {
		int n=a.length,m=a[0].length;
		if(x==0&&y==m-1){
			if(min>p)
				min=p;
			if(p<=all&&flag==0){
				flag=1;
				for(int f=0;f<st.size()-1;f++){
					System.out.print(st.elementAt(f)+",");
				}
				System.out.println(st.elementAt(st.size()-1));
			}
			return;
		}
		if(x<0||x>=n||y<0||y>=m){
			return;
		}
		for(int i=0;i<k;i++){
			
			int dx=x+next[i][0];
			int dy=y+next[i][1];
			if(dx<0||dx>=n||dy<0||dy>=m){
				continue;
			}			
			if(a[dx][dy]==1&&!b[dx][dy]){
				if(i==0||i==3){
					st.push("["+dx+","+dy+"]");
					b[dx][dy]=true;
					dfs(a,dx,dy,b,p+1,all);
					b[dx][dy]=false;
					st.pop();
				}else if(i==2){
					st.push("["+dx+","+dy+"]");
					b[dx][dy]=true;
					dfs(a,dx,dy,b,p,all);
					b[dx][dy]=false;
					st.pop();
				}else{
					st.push("["+dx+","+dy+"]");
					b[dx][dy]=true;
					dfs(a,dx,dy,b,p+3,all);
					b[dx][dy]=false;
					st.pop();
				}
			}
			
		}
		
	}
}
