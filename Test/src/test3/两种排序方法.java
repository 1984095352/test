package test3;

import java.util.Arrays;
import java.util.Scanner;
public class 两种排序方法 {
	static int nn=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	int flag1=0,flag2=1;
        	String s[]=new String[n];
        	for(int i=0;i<n;i++){
        		s[i]=sc.next();
        	}
        	String sb[]=new String[n];
        	sb=s.clone();
        	Arrays.sort(s);
        	if(Arrays.equals(s, sb))
        		flag1=1;
        	for(int i=0;i<n-1;i++){
        		if(sb[i+1].length()<sb[i].length())
        			flag2=0;
        	}
        	if(flag1==1&&flag2==0)
        		System.out.println("lexicographically");
        	else if(flag1==0&&flag2==1)
        		System.out.println("lengths");
        	else if(flag1==1&&flag2==1)
        		System.out.println("both");
        	else
        		System.out.println("none");
        }
        sc.close();
    }

	

	
}
