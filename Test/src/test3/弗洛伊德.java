package test3;

import java.util.Scanner;
public class 弗洛伊德 {
/*
 * 
4
0 1 2 3
1 0 4 5
2 4 0 2
3 5 2 0
 */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入顶点数：");  
        int n=sc.nextInt();
        int g[][]=new int[n][n];
        while(sc.hasNext()) {
        	for(int i=0;i<n;i++){
        		for(int j=0;j<n;j++){
            		g[i][j]=sc.nextInt();
            	}
        	}
        	int pathmatirx[][]=new int[n][n];;//记录对应点的最小路径的前驱点，例如p(1,3) = 2 说明顶点1到顶点3的最小路径要经过2 
        	int shortPath[][]=new int[n][n];;//记录顶点间的最小路径值
        	short_path_floyd(g, pathmatirx, shortPath);
        }
        
        sc.close();
    }

	private static void short_path_floyd(int[][] g, int[][] p,
			int[][] d) {
		int v, w, k;
	    //初始化floyd算法的两个矩阵 
	    for(v = 0; v < g.length; v++){
	        for(w = 0; w < g.length; w++){
	            d[v][w] = g[v][w];
	            p[v][w] = w;
	        }
	    }

	    //这里是弗洛伊德算法的核心部分 
	    //k为中间点 
	    for(k = 0; k < g.length; k++){
	        //v为起点 
	        for(v = 0 ; v < g.length; v++){
	            //w为终点 
	            for(w =0; w < g.length; w++){
	                if(d[v][w] > (d[v][k] + d[k][w])){
	                    d[v][w] = d[v][k] + d[k][w];//更新最小路径 
	                    p[v][w] = k;//更新最小路径中间顶点 
	                }
	            }
	        }
	    }
	    System.out.println("初始化的D矩阵");
	    for(v = 0; v < g.length; v++){
	        for(w = 0; w < g.length; w++){
	        	System.out.print(d[v][w]);
	        }
	        System.out.print("\n");
	    }

	    System.out.println("初始化的P矩阵");
	    for(v = 0; v < g.length; v++){
	        for(w = 0; w < g.length; w++){
	        	System.out.print(p[v][w]);
	        }
	        System.out.print("\n");
	    }

	    v = 1;
	    w = 2;
	    //求 0 到 3的最小路径
	    System.out.println(v+"到"+w+"的最小路径为：" + d[v][w]);
	    k = p[v][w];
	    System.out.print( v+"->");//打印起点
	    while(k != w){
	    	System.out.print(k+"->");//打印中间点
	        k = p[k][w]; 
	    }
	    System.out.print( w);
	}

	

}
