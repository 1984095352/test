package test;

import java.util.Scanner;

public class Main4 {

	/**
	 * 输入一个int型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
	 * @param args
	 */
	
	public static void main(String [] args){
    
	    Scanner sc=new Scanner(System.in);
	    int input=sc.nextInt();
	    String s=String.valueOf(input);
	    char[] c=s.toCharArray();
	    getResult(c);
	    sc.close();

    }

	/*private static void getResult(char[] c) {
		int len=c.length;		
		for(int i=len-1;i>=0;i--){
			int flag=0;
			char tmp=c[i];			
			for(int j=len-1;j>i;j--){
				if(tmp==c[j]){
				c[j]=' ';
				flag=1;
				}				
			}
			if(flag==0){
				System.out.print(c[i]);
			}
			
		}
		//System.out.println(Arrays.toString(c));
		
	}*/

	private static void getResult(char[] c) {
		int len=c.length;
		int flag[]=new int[128];
		for(int i=len-1;i>=0;i--){
			if(flag[c[i]]==0){
				flag[c[i]]++;
				System.out.print(c[i]);
			}
			
		}
			
		
		//System.out.println(Arrays.toString(c));
		
	}
	 
	
	
}
