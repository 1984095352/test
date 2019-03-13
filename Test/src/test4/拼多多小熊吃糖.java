package test4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class 拼多多小熊吃糖 {
	/*输入描述:
		第一行两个正整数n和m，分别表示小熊数量和糖的数量。（n <= 10, m <= 100）
		第二行m个正整数，每个表示着颗糖能填充的饥饿值。
		接下来的n行，每行2个正整数，分别代表每只小熊的战斗力和当前饥饿值。
		题目中所有输入的数值小于等于100。


		输出描述:
		输出n行，每行一个整数，代表每只小熊剩余的饥饿值。

		输入例子1:
		2 5
		5 6 10 20 30
		4 34
		3 35

		输出例子1:
		4
		0

		例子说明1:
		第一只小熊吃了第5颗糖
		第二只小熊吃了第4颗糖
		第二只小熊吃了第3颗糖
		第二只小熊吃了第1颗糖*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int n=sc.nextInt();
        	int m=sc.nextInt();
        	List<Integer> list=new ArrayList<Integer> ();
        	for(int i=0;i<m;i++)
        		list.add(sc.nextInt());
        	Integer a[][]=new Integer [n][2];
        	for(int i=0;i<n;i++){
        		a[i][0]=sc.nextInt();
        		a[i][1]=sc.nextInt();
        	}
        	Integer[][] b=a.clone();
        	int c[]=new int[n];
        	Collections.sort(list,new Comparator<Integer>() {

				@Override
				public int compare(Integer o1, Integer o2) {
					
					return o1-o2;
				}
			});
        	Arrays.sort(a,new Comparator<Integer[]>() {

				@Override
				public int compare(Integer[] o1, Integer[] o2) {
					
					return o2[0]-o1[0];
				}
			});
        	for(int i=0;i<n;i++){
        		int t=a[i][1];
        		int f=a[i][0];
        		
        		int index=Collections.binarySearch(list, a[i][1]);
        		while(index!=-1&&!list.isEmpty()){
        			if(index<-1){
        				t-=list.get(-(index+2));
        				list.remove(-(index+2));
        				index=Collections.binarySearch(list, t);
        			}else{
        				t-=list.get(index);
        				list.remove(index);
        				index=Collections.binarySearch(list, t);
        			}
        		}
        		for(int j=0;j<n;j++){
        			if(f==b[j][0]&&a[i][1]==b[j][1]){
        				c[j]=t;
        			}
        		}
        	}
        	for(int j=0;j<n;j++){
        		System.out.println(c[j]);
    		}
        	
        }
        
        sc.close();
        
        
    }
    
	
}
