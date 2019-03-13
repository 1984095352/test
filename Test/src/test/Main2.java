package test;

import java.util.Scanner;

public class Main2 {

	/**
	 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
	 * @param args
	 */
	
	public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    float n=sc.nextFloat();
    int tmp=(int) n;
    int result=n-tmp>=0.5?tmp+1:tmp;
    System.out.println(result);
   
    sc.close();

    }

	
	 
	
	
}
