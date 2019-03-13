package test3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
public class 幸运的袋子 {
	public static void main(String[] args)throws Exception{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line1=null;
        while((line1=in.readLine())!=null){
            int n = Integer.parseInt(line1);
            String line2 = in.readLine();
            String[] Arr2 = line2.trim().split(" ");
            int[] boll = new int[n];
            for(int i=0;i<n;i++){
                boll[i]=Integer.parseInt(Arr2[i]);
            }
            Arrays.sort(boll);
            int result = calc(boll,0,0,1);
            System.out.println(result);
        }
    }
     
    public static int calc(int[] boll,int index,int sum,int mult){
        int count=0;
        /*if(index>=boll.length-1){
        	return count;
        }*/
        for(int i=index;i<boll.length;i++){
            sum+=boll[i];
            mult*=boll[i];
            if(sum>mult){
                count+=1+calc(boll,i+1,sum,mult);
            }else if(boll[i]==1){
                count+=calc(boll,i+1,sum,mult);
            }else
                break;
            sum-=boll[i];
            mult/=boll[i];
            while(i<boll.length-1&&boll[i]==boll[i+1]){
                i++;
            }
        }
        return count;
    }
}
