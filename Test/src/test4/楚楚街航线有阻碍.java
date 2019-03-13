package test4;

import java.util.Scanner;

public class 楚楚街航线有阻碍 {
    public static int bigNum=2000000;
    public static void main(String[] arg){
        Scanner in=new Scanner(System.in);
        while(in.hasNext()){
            int N=in.nextInt();
            int M=in.nextInt();
            int[][][] map=new int[N][N][3];//0-k 1-x 2-y
            initMap(map,N);//初始化map
            in.nextLine();
            for(int i=0;i<M;i++){
                int p=in.nextInt();
                int q=in.nextInt();
                int k=in.nextInt();
                int x=in.nextInt();
                int y=in.nextInt();
                map[p-1][q-1][0]=k;
                map[p-1][q-1][1]=x;
                map[p-1][q-1][2]=y;
                map[q-1][p-1][0]=k;
                map[q-1][p-1][1]=x;
                map[q-1][p-1][2]=y;
                in.nextLine();
            }
            //int startTime=getTime(map[0][0],0);
            int res=Dijkstra(map,N);
            System.out.println(res+1);
        } 
      }//end main
    public static int Dijkstra(int[][][] map,int n){
        int[] dist=new int[n];
        boolean[] record=new boolean[n];   
        for(int i=0;i<n;i++){
            dist[i]=getTime(map[0][i],0);//初始化dist[i]数组---代表从起点到i的花费时间;
            record[i]=false;//记入点是否被扫描选中
        }
        record[0]=true;
       // int res=bigNum;
        int min=bigNum;
        int v=0;
        for(int i=1;i<n;i++){ 
            min=bigNum;
            for(int j=0;j<n;j++){
                if(!record[j]&&dist[j]<min){
                    min=dist[j];
                    v=j;               
                }
            }
            record[v]=true;
            for(int j=1;j<n;j++){
                if(i!=j){
                    int newTime=getTime(map[v][j],dist[v]);
                    dist[j]=dist[j]<newTime?dist[j]:newTime;                
                }                  
            }          
        }            
        return dist[n-1];
    }
     public static int getTime(int[] map,int time){
          
          
         int k=map[0];//正常航行时间
         //if(k==0&&time==0)return 0;
         if(map[2]<time||map[1]>time+k)return time+k;
         else return map[2]+k;
        
     }
    public static void initMap(int[][][] map,int n){//初始化map
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)map[i][j][0]=0;
                else map[i][j][0]=bigNum;
            }
        }
    }
}
