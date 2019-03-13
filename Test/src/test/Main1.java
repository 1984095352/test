package test;

import java.util.Scanner;

public class Main1 {

	/**
	 * 功能:输入一个正整数，按照从小到大的顺序输出它的所有质数的因子（如180的质数因子为2 2 3 3 5 ）
  		最后一个数后面也要有空格
	 * @param args
	 */
	
	public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNextInt()){
    	int n=sc.nextInt();
    	
    	getResult(n);
    	
    }
    sc.close();

    }

	private static void getResult(int n) {
		int i=2;
		while(i>=2&&n>=i){
			if(n==i){
				System.out.print(i);
				break;
			}else{
				if(n%i==0){
					System.out.print(i+" ");
					n/=i;
				}else{
					i++;
				}
			}
		}
		
	}
	 
	
	
}
