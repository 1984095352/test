package test2;

import java.util.Scanner;

public class 挑7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();         
            int rs=getRs(n);
            System.out.println(rs);
        }
        sc.close();
    }

	private static int getRs(int n) {
		int count=0;
		while(n>6){
			if(n%7==0){
				count++;
			}else{
				String s=String.valueOf(n);
				if(s.contains("7")){
					count++;
				}
			}
			n--;
		}
		return count;
	}

	

	
}
