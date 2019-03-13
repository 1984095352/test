package test2;

import java.util.Scanner;

public class 掷骰子 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int n=sc.nextInt();
        	System.out.println(getRs(n));
        }
        sc.close();
        
        
    }

	private static int getRs(int n) {
		
		if(n<1){
			return 0;
		}else if(n==1){
			return 1;
		}else 
			return 2*getRs(n-1);
	}
		


	
}
