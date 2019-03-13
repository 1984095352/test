package test2;

import java.util.Scanner;

public class 差值最小素数对 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();         
            String rs=getRs(n);
            System.out.println(rs);
        }
        sc.close();
    }

	private static String getRs(int n) {
		int p1=n/2,p2=n/2;
		while(!(isSushu(p1)&&isSushu(p2))){
			p1--;
			p2++;
		}
		return p1+"\r"+p2;		
	}

	private static boolean isSushu(int n) {
		int i=2;
		while(n>i){
			if(n%i==0)
				return false;
			i++;
		}
		return true;
	}	
}
