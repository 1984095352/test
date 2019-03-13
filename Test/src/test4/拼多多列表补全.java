package test4;

import java.util.Scanner;

public class 拼多多列表补全 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	int offset=sc.nextInt();
        	int n=sc.nextInt();
        	int l1=sc.nextInt();
        	int l2=sc.nextInt();
        	print(offset,n,l1,l2);
        }
        sc.close();
        
        
    }

	private static void print(int offset, int n, int l1, int l2) {
		int p1,p2,p3,p4;
		if(l1>offset){
			p1=offset;
			if(n>=l1-offset){
				p2=l1;
				p3=0;
				p4=n-l1+offset;
			}else{
				p2=n+offset;
				p3=0;
				p4=0;
			}
		}else{
			p1=l1;
			p2=l1;
			if(offset>=l1+l2){
				p3=l2;
				p4=l2;
			}else{
				p3=offset-l1;
				if(n>=l2){
					p4=l2;
				}else{
					p4=n+p3;
				}
			}
		}
		System.out.println(p1+" "+p2+" "+p3+" "+p4);
	}

	

	

	
}
