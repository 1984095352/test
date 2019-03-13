package test2;

import java.util.Scanner;

public class 放苹果 {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         while (sc.hasNext()){
             int m=sc.nextInt();
             int n=sc.nextInt();
             System.out.println(F(m,n));
        }
    }
    public static int F(int m,int n){
       if(m==0||n==1){
    	   return 1;
       }
       if(m<n){
    	   return F(m,m);
       }else      {
    	   return F(m-n,n)+F(m,n-1);
       }
        
    }

	

	
}
