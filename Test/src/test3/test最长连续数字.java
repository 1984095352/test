package test3;

import java.util.Scanner;
public class test最长连续数字 {
	//abcd12345ed125ss123456789
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	String s=sc.nextLine();
        	String rs=getRs(s.toCharArray());
        	System.out.println(rs);
        	
        }
        sc.close();
    }

	private static String getRs(char[] c) {
		int max=0,count=0,end=0;
				
		for(int i=0;i<c.length;i++){
			if(c[i]>=48&&c[i]<=57){
				count++;
				if(max<count){
					max=count;
					end=i+1;
				}
				
			}else{
				count=0;
			}
		}
		String s=String.valueOf(c);
		return s.substring(end-max,end);
	}

	
}
