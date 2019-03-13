package test3;

import java.util.Scanner;

public class 合唱团 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            //总人数
            int n = sc.nextInt();
            //学生能力值数组，第i个人直接对应arr[i]
            int[] arr = new int[n + 1];
            //初始化
            for (int i = 1; i <= n; i++) {//人直接对应坐标
                arr[i] = sc.nextInt();
            }
            //选择的学生数
            int kk = sc.nextInt();
            //间距
            int dd = sc.nextInt();

            /**
47
-41 -5 -10 -31 -44 -16 -3 -33 -34 -35 -44 -44 -25 -48 -16 -32 -37 -8 -33 -30 -6 -18 -26 -37 -40 -30 -50 -32 -5 -41 -32 -12 -33 -22 -14 -34 -1 -41 -45 -8 -39 -27 -23 -45 -10 -50 -34 
6 3
5504557500
             * 递推的时候，以f[n][k]的形式表示
             * 其中：n表示最后一个人的位置，k为包括这个人，一共有k个人
             * 原问题和子问题的关系：f[n][k]=max{f[n-1][k-1]*arr[n],f[n-1][k]}
             */
            //规划数组
            long[][] f = new long[n + 1][kk + 1];//人直接对应坐标,n和kk都要+1
            long[][] g = new long[n + 1][kk + 1];
            //初始化k=1的情况
            /*int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;*/
            for(int one = 1;one<=n;one++){
            	
                f[one][1] = arr[one];
                g[one][1] = arr[one];
            }
            //自底向上递推
            for(int k=2;k<=kk;k++){
                for(int i = k;i<=n;i++){
                   for(int j=i-1;j>=i-dd&&j>0;j--){
                	   f[i][k]=Math.max(g[j][k-1]*arr[i], Math.max(f[j][k-1]*arr[i],f[i][k]));
                	   g[i][k]=Math.min(f[j][k-1]*arr[i], Math.min(g[j][k-1]*arr[i],g[i][k]));
                	    
                   }
                }
            }
            //n选k最大的需要从最后一个最大的位置选
            long result = Long.MIN_VALUE;
            for(int one = kk;one<=n;one++){
                if(result<f[one][kk]){
                    result = f[one][kk];
                }
            }
            System.out.println(result);
        }
    }
}
