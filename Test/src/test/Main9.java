package test;

import java.util.Scanner;

public class Main9 {

	/**
	输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
	 */
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextInt()){
        	int n=sc.nextInt(); 
        	int count=getResult(n);
        	System.out.println(count);
        }
        sc.close();
    }

	private static int getResult(int n) {
		int count=0;
		while(n>0){
			if(n%2==1){
				count++;
				n/=2;
			}else{
				n/=2;
			}
		}
		return count;
	}
	
}
