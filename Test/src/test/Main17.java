package test;

import java.util.Scanner;

public class Main17 {

	/**
	计算最少出列多少位同学，使得剩下的同学排成合唱队形
	说明：
	N位同学站成一排，音乐老师要请其中的(N-K)位同学出列，使得剩下的K位同学排成合唱队形。 
	合唱队形是指这样的一种队形：设K位同学从左到右依次编号为1，2…，K，他们的身高分别为T1，T2，…，TK，   则他们的身高满足存在i（1<=i<=K）使得T1<T2<......<Ti-1<Ti>Ti+1>......>TK。 
	你的任务是，已知所有N位同学的身高，计算最少需要几位同学出列，可以使得剩下的同学排成合唱队形
	 */

	    static int[] a;   
	    static int[] d;  
	    public static void main(String[] args) {  
	        Scanner in = new Scanner(System.in);  
	        int n = in.nextInt(); // 序列中数的个数  
	        a = new int[n + 1];  
	        d = new int[n + 1];  
	        for (int i = 1; i <= n; i++) {  
	            a[i] = in.nextInt();  
	            d[i] = 1; //初始化d  
	        }  
	        System.out.println(dpmax(n));  
	        in.close();  
	    }  
	    public static int dpmax(int n) {  
	        for (int i = 2; i <= n; i++) {  
	            for (int j = 1; j < i; j++) {  
	                if (a[j] < a[i])  
	                d[i] = Math.max(d[i], d[j] + 1);  
	            }  
	        }  
	        return d[n];  
	    }  
	 
	
}
