package test3;

import java.util.Scanner;
public class 优雅的点 {
	//4 1 1 1 3

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();
        	//System.out.println(Math.pow(Math.sqrt(7), 2));
        	System.out.println(getRs(n));
        }
        sc.close();
    }
	private static int getRs(int n) {
		int count=0,i=1;
		/*while(i*i<=n){
			if(i*i<n){
				int m=n;
				if(Math.pow((int)Math.sqrt(m-i*i), 2)==(m-i*i)){
					count+=4;
				}
				i++;
			}else if(i*i==n){
				count+=4;
				i++;
			}
		
		}*/
		for(;i*i<=n;i++){
			if(i*i<n){
				int m=n;
				if(Math.pow((int)Math.sqrt(m-i*i), 2)==(m-i*i)){
					count+=4;
				}
				
			}else if(i*i==n){
				count+=4;
				
			}
		}
		return count;		
	}
	
	
}
