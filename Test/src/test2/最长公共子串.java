package test2;

import java.util.Scanner;

public class 最长公共子串 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();         
            String s2 = sc.nextLine();
            String rs = getRs(s1,s2);    
            System.out.println(rs);
        }
        sc.close();
    }

	private static String getRs(String s1,String s2) {
		String rs = "";
		String longer=s1.length()>s2.length()?s1:s2;
		String shorter=s1.length()>s2.length()?s2:s1;
		int[][]dp=new int[longer.length()+1][shorter.length()+1];
		for(int j=1;j<=shorter.length();j++){
			for(int i=1;i<=longer.length();i++){			
				if(longer.charAt(i-1)==shorter.charAt(j-1)){
					dp[i][j]=dp[i-1][j-1]+1;
					if(dp[i][j]>rs.length()){
						//max=dp[i][j];
						rs=shorter.substring(j-dp[i][j],j);
					}
				}
			}
		}
		//System.out.println(max);
		return rs;		
	}

	

	
}
