package test3;

import java.util.Scanner;
public class 地牢逃脱 {
	static int min=Integer.MAX_VALUE;
	static int k=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	String [][] a=new String[n][m];        	
        	for(int i=0;i<n;i++){
        		String s=sc.next();
        		for(int j=0;j<m;j++){
        			a[i][j]=String.valueOf(s.charAt(j));
        		}
        	}
        	int x0=sc.nextInt();
        	int y0=sc.nextInt();
        	k=sc.nextInt();
        	int [][] next=new int[k][2];
        	for(int i=0;i<k;i++){
        		next[i][0]=sc.nextInt();
        		next[i][1]=sc.nextInt();
        	}
        	boolean b[][]=new boolean[n][m];
        	int end[]=getEnd(a,x0,y0);
        	dfs(a,x0,y0,b,0,next,end);
        	if(min!=Integer.MAX_VALUE){
        		System.out.println(min);
        	}else{
        		System.out.println(-1);
        	}
        }
        sc.close();
    }

	private static int[] getEnd(String[][] a, int x0, int y0) {
		int end[]=new int[2];
		int max=0;
		for(int i=0;i<a.length;i++){
    		for(int j=0;j<a[0].length;j++){
    			if(a[i][j].equals(".")){
	    			if(Math.abs((i-x0))+Math.abs((j-y0))>max){
	    				max=Math.abs((i-x0))+Math.abs((j-y0));
	    				end[0]=i;end[1]=j;
	    			}
    			}
    		}
    	}
		return end;
	}

	private static void dfs(String[][] a, int x, int y, boolean[][] b, int step,int [][] next,int end[]) {
		int xl=a.length,yl=a[0].length;
		if(x==end[0]&&y==end[1]){
			if(min>step)
				min=step;
			return;
		}
		if(x<0||x>=xl||y<0||y>=yl){
			return;
		}
		for(int i=0;i<k;i++){
			int dx=x+next[i][0];
			int dy=y+next[i][1];
			if(dx<0||dx>=xl||dy<0||dy>=yl){
				return;
			}
			if(a[dx][dy].equals(".")&&!b[dx][dy]){
				b[dx][dy]=true;
				dfs(a,dx,dy,b,step+1,next,end);
				b[dx][dy]=false;
			}
		}
		
	}
}
