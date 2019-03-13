package test;

import java.util.Scanner;

public class Main11 {

	/**
	开发一个坐标计算工具， A表示向左移动，D表示向右移动，W表示向上移动，S表示向下移动。从（0,0）点开始移动，
	从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
	 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
        	int p1=0,p2=0;
            String s=sc.nextLine();
            String arr[]=s.split("\\;");
           // System.out.println(Arrays.toString(arr));
            for(int i=0;i<arr.length;i++){
        	    char [] c=arr[i].toCharArray();
        	    if(c.length==2){
	        	    if(c[0]=='A'||c[0]=='D'||c[0]=='W'||c[0]=='S'){
	        	    	if(c[1]>=48&&c[1]<58){
	        	    		int count=Integer.valueOf(c[1]-48);
	        	    		switch (c[0]){
	        	    			case 'A':
	        	    				p1=p1-count;
	        	    				break;
	        	    			case 'D':
	        	    				p1=p1+count;
	        	    				break;
	        	    			case 'W':
	        	    				p2=p2+count;
	        	    				break;
	        	    			case 'S':
	        	    				p2=p2-count;
	        	    				break;
	        	    		}
	        	    	}
	        	    }
        	    }else if(c.length==3){
	        	    if(c[0]=='A'||c[0]=='D'||c[0]=='W'||c[0]=='S'){
	        	    	if(c[1]>=48&&c[1]<58&&c[2]>=48&&c[2]<58){
	        	    		int count=Integer.valueOf(c[1]-48)*10;
	        	    		int count2=Integer.valueOf(c[2]-48);
	        	    		switch (c[0]){
	        	    			case 'A':
	        	    				p1=p1-count-count2;
	        	    				break;
	        	    			case 'D':
	        	    				p1=p1+count+count2;
	        	    				break;
	        	    			case 'W':
	        	    				p2=p2+count+count2;
	        	    				break;
	        	    			case 'S':
	        	    				p2=p2-count-count2;
	        	    				break;
	        	    		}
	        	    	}
	        	    	
	        	    }
        	    }    
            }
           System.out.println(p1+","+p2);
        }
        sc.close();
    }

	
	
}
