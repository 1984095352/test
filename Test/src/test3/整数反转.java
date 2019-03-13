package test3;
import java.io.IOException;
public class 整数反转 {
    public static void main(String[] args) throws IOException{
    	System.out.println(reve(12101));
        System.out.println(rev(12101));
    }
    private static StringBuffer reve(int n) {
    	while(n%10==0){
    		n/=10;
    	}
		String s=String.valueOf(n);
		StringBuffer sb=new StringBuffer();
		sb.append(s);
		sb.reverse();
		return sb;
	}
	static int rev(int x) {
        int result = 0;
        while(x != 0) {
            result = x % 10 + result * 10;
            x /= 10;
        }
        return result;
    }
}