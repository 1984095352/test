package test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main16 {

	/**
	实现删除字符串中出现次数最少的字符，若多个字符出现次数一样，则都删除。
	输出删除这些单词后的字符串，字符串中其它字符保持原来的顺序。
	 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        while (sc.hasNextLine()) {
        	String s=sc.nextLine();
        	char[] c=s.toCharArray();
        	getResult(c);
        }        
        sc.close();
    
	
    }

	private static void getResult(char[] c) {
		Map<String,Integer> map=new LinkedHashMap<>();
		int min=0;
		char minc=' ';
		for(int i=0;i<c.length;i++){
			char tmp=c[i];
			int n=1;
			for(int j=i+1;j<c.length;j++){
				if(!map.containsKey(String.valueOf(c[i]))){
					if(c[j]==tmp){
						n++;
					}
				}
			}
			if(!map.containsKey(String.valueOf(c[i]))){
				if(i==0){
					min=n;
				}else{
					if(min>=n){
						min=n;
						minc=c[i];
					}
				}
				map.put(String.valueOf(c[i]), n);				
			}
			
		}
		map.remove(String.valueOf(minc));
		String arr[]=new String[c.length];
		int f=0;
		for(String s:map.keySet()){			
			if(map.get(s)==min){
				arr[f++]=s;
			}			
		}
		arr[f]=String.valueOf(minc);
		for(String s:arr){			
			for(int g=0;g<c.length;g++){
				if(String.valueOf(c[g]).equals(s)){
					c[g]=' ';
				}
			}
		}
		for(char b:c){
			if(b!=' '){
				System.out.print(b);
			}
		}
		System.out.println(Arrays.toString(c));
		
	}


	

	
	
}
