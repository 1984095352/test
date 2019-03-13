package test4;

public class Singleton {
	private  static Singleton singleton=new Singleton();
	private Singleton(){}
	public static synchronized Singleton getInstance(){
		return singleton;
	}
	public static void main(String[] args) {
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		System.out.println(s1);
		System.out.println(s2);
	}
}