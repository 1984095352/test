package test2;

import java.util.Scanner;

public class 字符串第一次出现的字符 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.next();         
            String rs=getRs(s);
            System.out.println(rs);
        }
        sc.close();
    }

	private static String getRs(String s) {
		char rs = 0;		
		char [] c=s.toCharArray();
		boolean[] b=new boolean[c.length];
		for(int i=0;i<c.length;i++){			
			for(int j=0;j<i;j++){
				if(c[j]==c[i]){
					b[i]=true;
					b[j]=true;
				}
			}
		}
		for(int i=0;i<c.length;i++){
			if(!b[i]){
				rs=c[i];
				break;
			}
			if(i==c.length-1)
				return "-1";
		}
		return String.valueOf(rs);
	}

	

	
}
