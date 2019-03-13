package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class Main18 {

	/**
	信息社会，有海量的数据需要分析处理，比如公安局分析身份证号码、 QQ 用户、手机号码、银行帐号等信息及活动记录。  

	采集输入大数据和分类规则，通过大数据分类处理程序，将大数据分类输出。
	 */

	    static int[] a;   
	    static int[] b;  
	    public static void main(String[] args) {  
	        Scanner in = new Scanner(System.in);  
	        int n1 = in.nextInt(); // 序列中数的个数  
	        a = new int[n1 ];  	         
	        for (int i = 0; i <n1; i++) {  
	            a[i] = in.nextInt();  	            
	        } 
	        int n2 = in.nextInt(); // 序列中数的个数 
	        b = new int[n2]; 
	        for (int i = 0; i < n2; i++) {  
	            b[i] = in.nextInt();  	            
	        }
	        TreeSet<Integer> set=new TreeSet<Integer>();
	        for(int i=0;i<b.length;i++){
	        	set.add(b[i]);
	        }
	        List<Integer> l=new ArrayList<Integer>();
	        for(Integer i:set){
	        	int count=0;	        	
	        	for(int j=0;j<a.length;j++){
	        		if(String.valueOf(a[j]).contains(String.valueOf(i))){
	        			count++;	        			
	        		}
	        	}
	        	if(count!=0){
		        	/*System.out.print(i+" ");
		        	System.out.print(count+" ");*/
	        		l.add(i);
	        		l.add(count);
	        	}
	        	for(int j=0;j<a.length;j++){
	        		if(String.valueOf(a[j]).contains(String.valueOf(i))){
	        			//System.out.print(j+" "+a[j]+" ");
	        			l.add(j);
	        			l.add(a[j]);
	        		}
	        	}       	
	        }
	        System.out.print(l.size()+" ");
	        for(int f=0;f<l.size()-1;f++){
	        	System.out.print(l.get(f)+" ");
	        }
	        System.out.print(l.get(l.size()-1));
	        in.close();  
	    }  
	    
	   
	 
	
}
