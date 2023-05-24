package examplePro.designPattern.creational.singleton;

/**
 * @author msko
 * Bill Pugh Singleton Implementaion 방식의 싱글톤 생성
 * 
 */
public class Singleton {

	private Singleton() {}
	
	private static class SingletonHelper{
		private static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
	
	public void printTest() {
		System.out.println("TEST!");
	}
}
