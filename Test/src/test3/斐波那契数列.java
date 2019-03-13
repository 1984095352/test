package test3;

import java.util.Scanner;
public class 斐波那契数列 {
	static int nn=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	System.out.println(getRs(n));
        }
        sc.close();
    }
	private static int getRs(int n) {
		int fb1=0,fb2=1;
		while(fb2<n){
			int t=fb2;
			fb2=fb1+fb2;
			fb1=t;
		}
		return Math.min(n-fb1, fb2-n);
	}
	
	
}
