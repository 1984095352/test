package test3;
import java.util.Scanner;
public class 买苹果 {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	int n=sc.nextInt();    
        	System.out.println(getRs(n));
        }
        sc.close();
    }
	private static int getRs(int n) {
		int d[]=new int[n+1];
		for(int i=1;i<=n;i++){
			d[i]=Integer.MAX_VALUE;
		}
		int t[]={6,8};
		for(int i=0;i<=n;i++){
			if(d[i]==Integer.MAX_VALUE) continue;
			for(int j=0;j<2;j++){
				int temp=i+t[j];
				if(temp<=n&&d[temp]>d[i]+1)
					d[temp]=d[i]+1;
			}
		}
			
		return d[n]==Integer.MAX_VALUE?-1:d[n];
			
	}
	
}