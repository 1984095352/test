package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class duoxiancheng implements Runnable {
 
    private String name;
    private Object prev;
    private Object self;
    private int count;
    private duoxiancheng(String name, Object prev, Object self, int count) {
        this.name = name;
        this.prev = prev;
        this.self = self;
        this.count = count;
    }
    @Override
    public void run() {
        // int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;
                    self.notify();
                }
               try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
           }
        }
    }
    public static void main(String[] args) throws Exception {
        Object a = new Object();
        Object b = new Object();
        Object c = new Object();
        Object d = new Object();
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        int count = Integer.valueOf(br.readLine());
        duoxiancheng pa = new duoxiancheng("A", d, a, count);
        duoxiancheng pb = new duoxiancheng("B", a, b, count);
        duoxiancheng pc = new duoxiancheng("C", b, c, count);
        duoxiancheng pd = new duoxiancheng("D", c, d, count);
         
        new Thread(pa).start();
        // 确保按顺序A、B、C执行
        Thread.sleep(100);
        new Thread(pb).start();
        Thread.sleep(100);
        new Thread(pc).start();
        Thread.sleep(100);
        new Thread(pd).start();
        
    }
}