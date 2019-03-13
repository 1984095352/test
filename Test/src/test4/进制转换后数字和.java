package test4;

import java.util.Scanner;

public class 进制转换后数字和 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int n=sc.nextInt();
        	int cnt=0;
        	for(int i=2;i<n;i++){
        		cnt+=getNum(i,n);
        	}
        	int d=getYueShu(cnt,n-2);
        	System.out.println(cnt/d+"/"+(n-2)/d);
        	
			
        }
        
        sc.close();
        
        
    }

	private static int getYueShu(int cnt, int i) {
		int max=cnt>i?cnt:i;
		int min=cnt>i?i:cnt;
		while(min!=0){
			int t=min;
			min=max%min;
			max=t;
		}
		return max;
	}

	private static int getNum(int i, int n) {
		int num=0;
		while(n!=0){
			num+=n%i;
			n/=i;
		}
		return num;
	}
    
	
}
