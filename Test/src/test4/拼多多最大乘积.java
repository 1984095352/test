package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class 拼多多最大乘积 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int n=sc.nextInt();
        	int a[]=new int [n];
        	TreeSet<Integer> set=new TreeSet<Integer>();
        	for(int i=0;i<n;i++){
        		a[i]=sc.nextInt();
        		set.add(a[i]);
        	}
        	
        	List<Integer> list=new ArrayList<Integer>(set);
        	long c=(long)list.get(list.size()-1)*list.get(list.size()-3)*list.get(list.size()-2);
        	long f=(long)list.get(list.size()-1)*list.get(0)*list.get(1);
        	if(list.get(list.size()-1)<0){
        		System.out.println((long)list.get(0)*list.get(1)*list.get(2));
        	}else
        	if(list.get(0)>0){
        		System.out.println(c);
        	}else
        	System.out.println(c>f?c:f);
        	 
        }
     
        sc.close();
        
        
    }


	
}
