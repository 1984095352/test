package test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class 称砝码 {

	/**
	 * 题目描述 称砝码。
	 */
	

	public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        while(cin.hasNext()){
            int n=cin.nextInt();//砝码种类
            int[]  weights=new int[n];
            int[]  numbers=new int[n];
            for(int i=0;i<n;i++)
                weights[i]=cin.nextInt();
            for(int i=0;i<n;i++)
                numbers[i]=cin.nextInt();
            int result=function(n,weights,numbers);
            System.out.println(result);
        }
        cin.close();
    }

		private static int function(int n, int[] weights, int[] numbers) {
			Set<Integer> set=new HashSet<Integer>();
			for(int i=0;i<=numbers[0];i++){
				set.add(i*weights[0]);
			}
			for(int i=1;i<n;i++){
				List<Integer>list =new ArrayList<Integer>(set);
				for(int j=1;j<=numbers[i];j++){
					set.add(j*weights[i]);
					for(int k=0;k<list.size();k++){
						set.add(list.get(k)+j*weights[i]);
					}
				}
			}
		return set.size();
	}

	
}