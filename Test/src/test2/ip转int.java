package test2;

import java.util.Scanner;

public class ip转int {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	String s=sc.next();
        	System.out.println(getRs(s));
        }
        sc.close();
        
        
    }

	private static int getRs(String s) {
		char[] c=s.toCharArray();
		int rs=0;
		for(int i=0;i<c.length;i++){
			if(c[i]!='.')
				rs=Integer.valueOf(c[i]-'0')+rs*2;
		}
		
		return rs;
	}

	

	
}
