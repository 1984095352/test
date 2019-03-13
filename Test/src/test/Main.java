package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * •连续输入字符串，请按长度为8拆分每个字符串后输出到新的字符串数组； 
	   •长度不是8整数倍的字符串请在后面补数字0，空字符串不处理。
	 * @param args
	 */
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        String s1=sc.nextLine();
	        String s2=sc.nextLine();
	        String arr[]=new String[30];	        
	        String sb1 ="";
	        String sb2 ="";
	        int j=0;
	        for(int i=0;i<s1.length();i++){
	        	if(s1.charAt(i)=="0".charAt(0)||s1.charAt(i)==" ".charAt(0)){
	        		
	        		continue;
	        	}
	        	
	        	sb1+=(String.valueOf(s1.charAt(i))) ;
	        	
	        }
	        for(int i=0;i<s2.length();i++){
	        	if(s2.charAt(i)=="0".charAt(0)||s2.charAt(i)==" ".charAt(0)){
	        		
	        		continue;
	        	}
	        	
	        	sb2+=(String.valueOf(s2.charAt(i))) ;
	        	
	        }
	        while(sb1.length()>=8){
	        	arr[j++]=sb1.substring(0,8);
	        	sb1=sb1.substring(8);
	        	System.out.println(arr[j-1]);
	        }
	        while(sb1.length()<8&&sb1.length()!=0){
	        	sb1=sb1+"00000000";
	        	arr[j++]=sb1.substring(0,8);
	        	System.out.println(arr[j-1]);
	        }
	        while(sb2.length()>=8){
	        	arr[j++]=sb2.substring(0,8);
	        	sb2=sb2.substring(8);
	        	System.out.println(arr[j-1]);
	        }
	        while(sb2.length()<8&&sb2.length()!=0){
	        	sb2=sb2+"00000000";
	        	arr[j++]=sb2.substring(0,8);
	        	System.out.println(arr[j-1]);
	        }
	       
	        System.out.println(Arrays.toString(arr));
	        sc.close();
	    }
	    
	/**
	 * 明明想在学校中请一些同学一起做一项问卷调查，为了实验的客观性，他先用计算机生成了N个1到1000
	 * 之间的随机整数（N≤1000），对于其中重复的数字，只保留一个，把其余相同的数去掉，不同的数对应
	 * 着不同的学生的学号。然后再把这些数从小到大排序，按照排好的顺序去找同学做调查。请你协助明明完成
	 * “去重”与“排序”的工作
	 * @param args
	 */
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int num = sc.nextInt();
            TreeSet<Integer> tc = new TreeSet<Integer>();
            while(num-->0&&sc.hasNextInt()){
                tc.add(sc.nextInt());
            }
            Iterator<Integer> it = tc.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
        }
        sc.close();
    }*/
	
	/**
	 *写出一个程序，接受一个十六进制的数值字符串，输出该数值的十进制字符串。（多组同时输入 ）
	 * @param args
	 */
	/*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
        	String s=sc.nextLine();
        	getTen(s);
        }
        sc.close();
	}

	private static void getTen(String s) {
		s=s.substring(2,s.length());
		char[]t=s.toCharArray();
		int[] arrTmp=sort(t);
		int ten=arrTmp[0],p=1;
		for(int i=1;i<arrTmp.length;i++){
			 p *=16;
			ten+=arrTmp[i]*p;
		}
		System.out.println(s);
		System.out.println(Arrays.toString(arrTmp));
		System.out.println(ten);
	}
	private static int[] sort(char[] t) {
		int[] arr=new int[16];
		int len=t.length-1;
		for(int i=0;i<t.length/2;i++){			
			char m=t[i];
			t[i]=t[len];
			t[len]=m;
			len--;
		}
		for(int i=0;i<t.length;i++){			
			switch (t[i]) {
			case '0':
				arr[i]=0;
				break;
			case '1':
				arr[i]=1;
				break;
			case '2':
				arr[i]=2;
				break;
			case '3':
				arr[i]=3;
				break;
			case '4':
				arr[i]=4;
				break;
			case '5':
				arr[i]=5;
				break;
			case '6':
				arr[i]=6;
				break;
			case '7':
				arr[i]=7;
				break;
			case '8':
				arr[i]=8;
				break;
			case '9':
				arr[i]=9;
				break;
			case 'A':
				arr[i]=10;
				break;
			case 'B':
				arr[i]=11;
				break;
			case 'C':
				arr[i]=12;
				break;
			case 'D':
				arr[i]=13;
				break;
			case 'E':
				arr[i]=14;
				break;
			case 'F':
				arr[i]=15;
				break;

			default:
				break;
			}
		}
		return arr;
		
	}*/
}
