package test;

import java.util.Scanner;

public class Main5 {

	/**
	 * 编写一个函数，计算字符串中含有的不同字符的个数。字符在ACSII码范围内(0~127)。不在范围内的不作统计。
	 * @param args
	 */
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] c=str.toCharArray();        
        int [] arr=new int[128];
        int count=0;
        for(int i=0;i<c.length;i++){
        	if(c[i]>=0&&c[i]<=127){
        		arr[c[i]]=1;        	
        	}
        		
        }
        for(int i=0;i<arr.length;i++){
        	if(arr[i]>0){
        		count++;
        		
        	}
        		
        }
        
        System.out.println(count);
        sc.close();
    }
	 
	
	
}
