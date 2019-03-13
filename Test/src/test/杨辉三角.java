package test;

import java.util.Scanner;

public class 杨辉三角 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt(); 
            int rs=initYanghuisanjiao(n);
            System.out.println(rs);
        }
        sc.close();
    }

	private static int initYanghuisanjiao(int n) {
		int a[][]=new int[n][2*n-1];
		for(int i=0;i<n;i++){
			/*for(int j=0;j<n-1;j++){
				a[i][j]=0;
			}*/
			if(i==0){
				a[0][n-1]=1;
			}else{
				for(int j=0;j<2*n-1;j++){
					if(j==0)
						a[i][j]=a[i-1][j]+a[i-1][j+1];							
					else if(j>0&&j<=n)
						a[i][j]=a[i-1][j-1]+a[i-1][j]+a[i-1][j+1];
					else
						a[i][j]=a[i-1][j-1]+a[i-1][j];
				}
			}
		}
		int m=0;
		for(int i=0;i<2*n-1;i++){
			if(a[n-1][i]%2==0){
				m=i+1;
				break;
			}
		}
		return m;
	}	
}
