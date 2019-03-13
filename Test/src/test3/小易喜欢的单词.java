package test3;

import java.util.Scanner;
public class 小易喜欢的单词 {
	static int nn=0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
        	String s=sc.next();        	
        	int flag1=1,flag2=1,flag3=0;
        	char c[]=s.toCharArray();
        	for(int i=0;i<c.length;i++){
        		if(c[i]>=97)
        			flag1=0;
        	}
        	for(int i=0;i<c.length-1;i++){
        		if(c[i]==c[i+1])
        			flag2=0;
        	}
        	flag3= hasSub(c);
        	if(flag1==1&&flag2==1&&flag3==1)
        		System.out.println("Likes");
        	else
        		System.out.println("Dislikes");
        }
        sc.close();
    }
	private static int hasSub(char[] c) {
		int len=c.length;
		for(int i=0;i<len;i++){
			for(int j=0;j<i;j++){
				for(int k=0;k<j;k++){
					for(int m=0;m<k;m++){
						if(c[m]==c[j]&&c[k]==c[i])
							return 0;
					}
				}
			}
		}
		return 1;
	}

	

	
}
