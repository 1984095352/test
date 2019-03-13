package test3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
public class sort方法倒序排列 {
	static int nn=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	/*
        	 * 数组排序
        	int n=sc.nextInt(); 
        	Integer s[]=new Integer [n];
        	for(int i=0;i<n;i++){
        		s[i]=sc.nextInt();
        	}
        	Integer sb[]=new Integer[n];
        	sb=s.clone();
        	Arrays.sort(s);
        	System.out.println(Arrays.toString(s));//从大到小
        	Arrays.sort(s,new Comparator<Integer >() {      		

				@Override
				public int compare(Integer o1, Integer o2) {
					// TODO Auto-generated method stub
					return o2-o1;
				}

			} ); 			
        	System.out.println(Arrays.toString(s));//从小到大
        	System.out.println(Arrays.toString(sb));//正常输出
        	
        	 */ 
        	
        	//复杂类型
        	int n=sc.nextInt(); 
        	Integer s[][]=new Integer [n][2];
        	for(int i=0;i<n;i++){
        		for(int j=0;j<2;j++){
        			s[i][j]=sc.nextInt();
        		}
        	}
        	Arrays.sort(s,new Comparator<Integer[] >() {      		

				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					if(o1[1]!=o2[1])
						return o1[1]-o2[1];
					else
						return o2[0]-o1[0];
				}

			} ); 
        	for(int i=0;i<n;i++)
        		System.out.println(Arrays.toString(s[i]));
        	
        }
        sc.close();
	
    }
	
}
