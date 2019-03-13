package test4;

public class 股市两次买入最大收益 {
	 public static int calculateMax(int[] prices) {
	        int firstBuy = Integer.MIN_VALUE, firstSell = 0;
	        int secondBuy = Integer.MIN_VALUE, secondSell = 0;
	 int i=1;
	        for (int curPrice : prices) {
	            firstBuy = Math.max(firstBuy, -curPrice);
	            firstSell = Math.max(firstSell, firstBuy + curPrice);
	            secondBuy = Math.max(secondBuy,firstSell - curPrice);
	            secondSell = Math.max(secondSell, secondBuy + curPrice);
	            System.out.println("第"+i+++"次"+firstBuy+" "+firstSell+" "+secondBuy+" "+secondSell);
	        }
	        return secondSell;
	    
	    }
	 public static void main(String[] args) {
		int a[]={3,6,5,1,7,8};
		int rs=calculateMax(a);
		System.out.println(rs);
	}
}
