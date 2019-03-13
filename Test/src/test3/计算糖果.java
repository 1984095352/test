package test3;

import java.util.Scanner;
public class 计算糖果 {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n1=sc.nextInt();
        	int n2=sc.nextInt();
        	int n3=sc.nextInt();
        	int n4=sc.nextInt();
        	int flag=0;
        	for(int i=-30;i<=30;i++){
        		if(((n3-i)==(n1+i))&&((i-n2)==(n4-i))){
        			flag=1;
        			System.out.println((n3-i)+" "+i+" "+(n4-i));
        		}
        	}
        	if(flag==0){
        		System.out.println("No");
        	}
        }
        sc.close();
    }
	
	
	
}
