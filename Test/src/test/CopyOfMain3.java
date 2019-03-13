package test;

import java.util.Scanner;

public class CopyOfMain3 {

	/**
	 * 数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出
	 * @param args
	 */
	
	public static void main(String [] args)
    {
    Scanner sc=new Scanner(System.in);
    String t=sc.nextLine();
    int n=Integer.parseInt(t);
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
    	String[] tmp=sc.nextLine().split("\\ ");
    	int m=Integer.parseInt(tmp[0]);    	
    	arr[m]+=Integer.parseInt(tmp[1]);
    	
    }
   // System.out.println(Arrays.toString(arr));
    for(int i=0;i<n;i++){
    	if(arr[i]!=0){
    		System.out.println(i+" "+arr[i]);
    	}
    }
    sc.close();

    }

	
	 
	
	
}
