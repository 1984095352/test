package test2;

import java.util.Scanner;

public class CopyOf挑7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int c=0;
            while(n>0){
            	n&=n-1;
            	c++;
            }
            System.out.println(c);
        }
        sc.close();
    }

	
}
