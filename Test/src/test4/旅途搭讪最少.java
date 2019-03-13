package test4;

import java.util.Scanner;

public class 旅途搭讪最少 {
	/*5 5
	0 1 1 3 6
	1 2
	1 4
	2 3
	3 5
	4 5*/
	public static void init(int[][] road,int n) {
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                road[i][j]=Integer.MAX_VALUE;
            }
        }
    }
 public static int dijkstra(int[][] road,int s,int n,int girl1) {
     int[] dist=new int[n+1];
     boolean[] isVisited=new boolean[n+1];
        for (int i=2;i<=n;i++) {
            dist[i]=road[s][i];
        }
        dist[s]=girl1;
        isVisited[s]=true;
        for (int i=2;i<n;i++) {
            int minDist=Integer.MAX_VALUE;
            int v=1;
            for(int j=1;j<=n;j++)
            {
                if(!isVisited[j]&&dist[j]<minDist)
                {
                    minDist=dist[j];
                    v=j;
                }
            }
            isVisited[v]=true;
            for(int j=1;j<=n;j++)
            {
                if(!isVisited[j]&&road[v][j]<Integer.MAX_VALUE)
                {
                    int temp=dist[v]+road[v][j];
                    dist[j]=dist[j]<temp?dist[j]:temp;
                }
            }
        }
        return dist[n]+girl1;
 }
/**
 * @param args
 */
public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner in=new Scanner(System.in);
    while(in.hasNext())
    {
        int n=in.nextInt();
        //表示n个汽车站内有M条公路
        int m=in.nextInt();
        int[][] road=new int[n+1][n+1];
        init(road,n);
        int girls[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            girls[i]=in.nextInt();
        }
        for (int i=0;i<m;i++) {
            int p=in.nextInt();
            int q=in.nextInt();
            road[p][q]=girls[q];
            road[q][p]=girls[p];
        }
        System.out.println(dijkstra(road,1,n,girls[1]));
    }
}

}
