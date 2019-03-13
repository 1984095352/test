package test2;

import java.util.Scanner;

public class 完全数 {

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
		int count=0,m=0;
		for(int j=2;j<=n;j++){
			int i=1;
			while(i<j){
				if(j%i==0){
					m+=i;				
				}
				i++;
			}
			if(m==j){
				count++;				
			}
			m=0;
		}
		return count;
	}

	

	
}
