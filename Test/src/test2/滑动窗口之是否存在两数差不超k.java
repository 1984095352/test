package test2;

import java.util.Scanner;
import java.util.TreeSet;

public class 滑动窗口之是否存在两数差不超k {
	/*
	leetcode220
	6
	2 3 1 2 4 3
	7
	*/
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 while(sc.hasNext()){
			 int n=sc.nextInt();
			 int num[]=new int[n];
			 for(int i=0;i<n;i++){
		        	num[i]=sc.nextInt();	 	        	
			 }
			int t=sc.nextInt();//差值
	        int k=sc.nextInt();//距离
	        System.out.println(containsNearbyAlmostDuplicate(num,k,t));
		 }
	     sc.close();
	        
	        
	}

	private static boolean containsNearbyAlmostDuplicate( int[] nums, int k,int t) {
		int r=-1;
		TreeSet<Integer> set=new TreeSet<Integer>() ;
		
		while(r+1<nums.length){
			//treeset.subSet()
			/*List<Integer> list=new ArrayList<Integer>(set);
			int index=Collections.binarySearch(list, num[r+1]-t);
			if(index==-1){
				index=0;
				if(num[index]<=num[r+1]+t){
					return true;
				}
			}*/
			TreeSet<Integer> ss=(TreeSet<Integer>) set.subSet(nums[r+1]-t, nums[r+1]+t+1);
			if(!ss.isEmpty()){
				return true;
			}
				set.add(nums[++r]);
	
			if(set.size()>k)
				set.remove(nums[r-k]);
		}
		return false;
	}

	
}
