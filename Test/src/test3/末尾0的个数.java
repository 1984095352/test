package test3;

import java.math.BigInteger;
import java.util.Scanner;
public class 末尾0的个数 {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt(); 
        	BigInteger rs=getRs(n);
        	int rs2=getRs2(n);
        	System.out.println(rs);
        	System.out.println(rs2);
        }
        sc.close();
    }
	
	private static int getRs2(int n) {
		int n5=n/5;
		int n25=n/25;
		int n125=n/125;
		int n625=n/625;
		return n5+n25+n125+n625;
	}

	private static BigInteger getRs(int n) {
		BigInteger rs=BigInteger.valueOf(n);
		if(n>1)
		return rs.multiply(getRs(n-1));
		else{
			return rs;
		}
	}

	

	
}
