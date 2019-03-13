package test;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        // 从键盘接收数据
	        int a[]=new int[10];
	        // next方式接收字符串
	        System.out.println("next方式接收：");
	        // 判断是否还有输入
	       /* while (scan.hasNextLine()) {
	            String str1 = scan.nextLine();
	            System.out.println("输入的数据为：" + str1);
	        }*/
	        int len=scan.nextInt();
	        for(int i=0;i<len;i++){
	        	a[i]=scan.nextInt();
	        }
	        scan.close();
	        System.out.println("输入的数据为：" +Arrays.toString(a));
	    }

}
