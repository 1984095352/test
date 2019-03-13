package test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main12 {

	/**
	开发一个简单错误记录功能小模块，能够记录出错的代码所在的文件名称和行号。
	处理： 	
	1、 记录最多8条错误记录，循环记录，对相同的错误记录（净文件名称和行号完全匹配）只记录一条，错误计数增加；
	2、 超过16个字符的文件名称，只记录文件的最后有效16个字符；
	3、 输入的文件可能带路径，记录文件名称不能带路径。
	 */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map=new LinkedHashMap<String, Integer>();
        while (sc.hasNextLine()) {
        	String s=sc.nextLine();
        	String fName_=s.substring(s.lastIndexOf("\\")+1,s.indexOf(" "));
        	String fName="";
        	if(fName_.length()<=16)
        		fName=fName_;
        	else
        		fName=fName_.substring(fName_.length()-16, fName_.length());
        	String fRow=s.substring(s.lastIndexOf(" ")+1); 
        	fName=fName+" "+fRow;
        	map=getResult(fName,map);
        	
        	
        	//System.out.println(fName);System.out.println(fRow);
        }
        int count = 0;
        for (String key:map.keySet()){
            count++;
            if(count > (map.size() -8))
            System.out.println(key + " " + map.get(key));
        }
    	
       
        sc.close();
    }

	private static Map<String,Integer> getResult(String fName,Map<String,Integer> map) {
		
		int flag=0;
		for(Map.Entry<String, Integer> entry : map.entrySet()){
			String fn=entry.getKey().toString();
			if(fn.equals(fName)){
				map.put(fn,map.get(fn)+1);
				flag=1;
			}
		}
		
		if(flag==0){
				map.put(fName, 1);
		}
		return map;
		
		
	}
	
	
}
