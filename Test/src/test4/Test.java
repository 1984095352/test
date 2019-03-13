package test4;

public class Test {

   public Test(int n){
	   this.n=n;
	   a=new int[n][n]; 
   };
   public int n;
   public int a[][];
   public void print( ) {
		print2();
	}
   public void print2( ) {
		System.out.println(a[0][0]);
	}
}
