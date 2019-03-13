package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main8 {

	/**
	给定n个字符串，请对n个字符串按照字典序排列。
	 */
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=Integer.valueOf(s);
        String arr[]=new String[n];
        for(int i=0;i<n;i++){        	
        	arr[i] =sc.nextLine();       	
        } 
        Arrays.sort(arr);
        for(String str:arr){
        	System.out.println(str);
        }
        
        sc.close();
    }
	
}
