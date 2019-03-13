package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 删数 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
        	
        	int n=sc.nextInt();
        	if(n>1000){
        		n=1000;
        	}
        	List<Integer> list= new ArrayList<Integer>();
        	for(int i=0;i<n;i++){
        		list.add(i);
        	}
        	print(2,n,list);
        	System.out.println(list.get(0));
        }
        sc.close();
        
        
    }

	private static void print( int i,int n,List<Integer> list) {
		if(n==1){
			return;
		}
		//list.remove(i);
		while(list.size()>1){
			for(;i<list.size();i+=2){
				list.remove(i);
			}
			i=i%list.size();
			print(i,list.size(),list);
		}
	}

	

	

	
}
