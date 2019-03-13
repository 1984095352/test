package test2;
import java.util.*;

public class Main {
	/**
	 * 题目描述迷宫最短路径。
5 5
0 1 0 0 0
0 1 0 1 0
0 0 0 0 0
0 1 1 1 0
0 0 0 1 0
	 */
	
	static int min = 1000;
	static Stack<String> st=new Stack<String>();
	
	static int next[][]={{0,1},{1,0},{-1,0},{0,-1}};

	public static void main(String[] args) {
		
		
        Scanner jin = new Scanner(System.in);
        while(jin.hasNext()) {
            int row = jin.nextInt();
            int col = jin.nextInt();
            int[][] maze = new int[row][col];
            int[][] b = new int[row][col];
            //b[row-1][col-1]=1;
            for(int i = 0; i < row; i++)
                for(int j = 0; j < col; j++)
                    maze[i][j] = jin.nextInt();
            st.push(0+" "+0);
            Dfs(maze, 0, 0, 1,b);
            //System.out.println(min);
           //hasPath(maze, 0, 0, 1, b);
            //System.out.println(min);
           /* for (int i = 0; i < b.length; i++) {
                for (int j = 0; j < b[0].length; j++) {
                    if (b[i][j]==1) {
                        System.out.println("("+i+","+j+")");
                    }
                }
            }*/
            
        }
    }

	/*private static boolean hasPath(int[][] maze, int i, int j,  int k, int[][] b) {
		boolean flag=false;
		if(i==maze.length-1&&j==maze[0].length-1&&maze[i][j]==0){
			b[i][j]=1;
			if(min>k)
				min=k;
			return true;
		}
		if(i>=maze.length||j>=maze[0].length){
			return false;
		}
		if(maze[i][j]==0&&b[i][j]==0){
			b[i][j]=1;
			flag=hasPath(maze, i+1, j,k+1 ,b)||hasPath(maze, i, j+1,k+1, b);
		}
		if(flag){
			return true;
		}else{
			b[i][j]=0;
			return false;
		}
	}*/

	private static void Dfs(int[][] maze, int i, int j, int step,int[][] b) {
		if(i>=maze.length||j>=maze[0].length||i<0||j<0){
			return;
		}
		if(i==maze.length-1&&j==maze[0].length-1){
			if(min>step){
				min=step;
			}
			for(int m=0;m<st.size();m++){
				System.out.println(st.elementAt(m));
			}
			return;
		}
		b[i][j]=1;
		for(int k=0;k<next.length;k++){
			int ni,nj;
			ni=i+next[k][0];
			nj=j+next[k][1];
			if(ni>=maze.length||nj>=maze[0].length||ni<0||nj<0){
				continue;
			}
			if(maze[ni][nj]==0&&b[ni][nj]==0){
				st.push(ni+" "+nj);
				b[ni][nj]=1;
				Dfs(maze, ni, nj, step+1,b);
				b[ni][nj]=0;
				st.pop();
			}
		}
	}
    
}