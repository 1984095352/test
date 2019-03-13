package test;

import java.util.Scanner;

public class Main14 {

	/**
	密码是我们生活中非常重要的东东，我们的那么一点不能说的秘密就全靠它了。哇哈哈.
	 接下来渊子要在密码之上再加一套密码，虽然简单但也安全。
	假设渊子原来一个BBS上的密码为zvbo9441987,为了方便记忆，
	他通过一种算法把这个密码变换成YUANzhi1987，这个密码是他的名字和出生年份，
	怎么忘都忘不了，而且可以明目张胆地放在显眼的地方而不被别人知道真正的密码。
	他是这么变换的，大家都知道手机上的字母： 1--1， abc--2, def--3, ghi--4,
	 jkl--5, mno--6, pqrs--7, tuv--8 wxyz--9, 0--0,就这么简单，
	 渊子把密码中出现的小写字母都变成对应的数字，数字和其他的符号都不做变换，
	声明：密码中没有空格，而密码中出现的大写字母则变成小写之后往后移一位，
	如：X，先变成小写，再往后移一位，不就是y了嘛，简单吧。记住，z往后移是a哦。
	 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        while (sc.hasNextLine()) {
        	String s=sc.nextLine();
        	String r=getesult(s);       	
        	System.out.println(r);
        }        
        sc.close();
    
	
    }

	private static String getesult(String s) {
		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++){
			if(c[i]>='A'&&c[i]<='Y'){
				c[i]=(char) (c[i]+33);
			}else if(c[i]=='Z'){
				c[i]='a';
			}else if(c[i]<='z'&&c[i]>='a'){
				if(c[i]>='a'&&c[i]<='c'){
					c[i]='2';
				}else if(c[i]>='d'&&c[i]<='f'){
					c[i]='3';
				}else if(c[i]>='g'&&c[i]<='i'){
					c[i]='4';
				}else if(c[i]>='j'&&c[i]<='l'){
					c[i]='5';
				}else if(c[i]>='m'&&c[i]<='o'){
					c[i]='6';
				}else if(c[i]>='p'&&c[i]<='s'){
					c[i]='7';
				}else if(c[i]>='t'&&c[i]<='v'){
					c[i]='8';
				}else if(c[i]>='w'&&c[i]<='z'){
					c[i]='9';
				}
			}
		}
		return String.valueOf(c);
	}

	
	
}
