package test2;

import java.util.Scanner;

public class 递归实现字符串反转 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s=sc.next();
            int n=s.length()-1;
            String rs=reverse(s,n);
            System.out.println(rs);
        }
        sc.close();
    }

	private static String reverse(String s, int n) {
		if(n==0){
			return String.valueOf(s.charAt(n));
		}else{
			return String.valueOf(s.charAt(n))+reverse(s,n-1);
		}
		
		
	}

	
}
