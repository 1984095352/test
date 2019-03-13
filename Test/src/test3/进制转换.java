package test3;

import java.util.Scanner;
public class 进制转换 {
	
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt(); 
        	int m=sc.nextInt();
        	String rs=getRs(n,m);
        	System.out.println(rs);
        	
        }
        sc.close();
    }

	private static String getRs(int n, int m) {
		StringBuffer sb=new StringBuffer();
		int t=n;
			if(n<0){
				
				n=-n;
			}
			while(n!=0){
				int c=n%m;
				if(c>9){
					switch (c) {
					case 10:
						sb.append("A");
						break;
					case 11:
						sb.append("B");
						break;
					case 12:
						sb.append("C");
						break;
					case 13:
						sb.append("D");
						break;
					case 14:
						sb.append("E");
						break;
					case 15:
						sb.append("F");
						break;
					default:
						break;
					}
				}else{
					sb.append(c);
				}
				n=n/m;
			}
		if(t<0)
			sb.append("-");
		return sb.reverse().toString();
	}
	
	

	
}
