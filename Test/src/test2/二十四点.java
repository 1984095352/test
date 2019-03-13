package test2;

import java.util.*;

public class 二十四点 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[4];
		while (input.hasNext()) {
			
			for (int i = 0; i < 4; i++) {
				num[i] = input.nextInt();
			}
			System.out.println(check(num, 0,3, 24));
		}
		input.close();
	}

	private static boolean check(int[] num, int b,int e, double result) {
		
			if(b==e){
				return (num[b]==result);
			}else{
				boolean f=false;
				for (int i = b; i <= e; i++) {
					swap(num,b,i);
					f=f||check(num,b+1,e,result+num[e])||check(num,b+1,e,result-num[e])||check(num,b+1,e,result*num[e])||check(num,b+1,e,result/num[e]);
					swap(num,b,i);
				}
				return f;
			}				
	}

	private static void swap(int[] num, int i, int j) {
		int t=num[j];
		num[j]=num[i];	
		num[i]=t;
		
	}
	
}