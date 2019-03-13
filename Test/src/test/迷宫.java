package test;

import java.util.Scanner;
import java.util.Stack;

public class 迷宫 {

	/**
	 * 题目描述 称砝码。
	 */
	

	public static void main(String[] args) {
        Scanner jin = new Scanner(System.in);
        while(jin.hasNext()) {
            int row = jin.nextInt();
            int col = jin.nextInt();
            int[][] maze = new int[row][col];
            for(int i = 0; i < row; i++)
                for(int j = 0; j < col; j++)
                    maze[i][j] = jin.nextInt();
           
            System.out.println(mazePath(maze, 0, 0,row,col));//正式走迷宫
        }
    }

		private static int mazePath(int[][] maze, int x, int y, int r, int c) {
			int[][] dp=new int[r][c];
			//初始化行
			for(int i = 1; i < r; i++){
				if(maze[i][0]!=1){
					dp[i][0]=dp[i-1][0]+1;
				}else{
					dp[i][0]=Integer.MAX_VALUE;
					for(int j=i;j<c;j++){
						dp[j][0]=Integer.MAX_VALUE;
					}
					break;
				}
			}
			//初始化列
			for(int i = 1; i < c; i++){
				if(maze[0][i]!=1){
					dp[0][i]=dp[0][i-1]+1;
				}else{
					dp[0][i]=Integer.MAX_VALUE;
					for(int j=i;j<c;j++){
						dp[0][j]=Integer.MAX_VALUE;
					}
					break;
				}
			}
			//开始走
			
			
			for(int i = 1; i < r; i++){
				for(int j = 1; j < c; j++){
					
					if(maze[i][j]!=1){
						
							//rs.add("("+i+","+(j-1)+")");
							
							dp[i][j]=Math.min(dp[i][j-1], dp[i-1][j])+1;
					}else{
						dp[i][j]=r*c;
					}
					
				}
			}
			Stack<String> s=new Stack<>();
			
			int i=r-1,j=c-1;
			s.add("("+(i)+","+(j)+")");	
			while(i!=0&&j!=0){
				if(dp[i][j-1]>=dp[i-1][j]){
					if(maze[i-1][j]!=1){
						s.add("("+(i-1)+","+(j)+")");	
						i--;
					}
				}else{					
					if(maze[i][j-1]!=1){
						s.add("("+(i)+","+(j-1)+")");
						j--;
					}
				}
			}
			if(i==0){
				for(int m=j-1;m>0;m--)
					s.add("("+(0)+","+(m)+")");	
			}
			if(j==0){
				for(int m=i-1;m>0;m--)
					s.add("("+(m)+","+(0)+")");	
			}
			s.add("("+(0)+","+(0)+")");	
			while(!s.isEmpty()){
				System.out.println(s.lastElement());
				s.pop();
			}
			return dp[r-1][c-1];
	}

	
}