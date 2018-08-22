package Com.Zhouhao;
/**
 * 抽象工厂的创建
 * @author ASUS zhouhao 
 *
 */

public class Implementation1 implements Service{
	private Implementation1(){}


	public void method1() {
		System.out.println("Implementation1 method1");
	}


	public void method2() {
		System.out.println("implemention1 method2");
	}
	public static ServiceFactory factory=new ServiceFactory() {
	
		public Service getService(){
			return new Implementation1();
		}
	};
	
	

}

class Implementation2 implements Service{

	private Implementation2(){}

	public void method1() {
		System.out.println("Implementation2 method1");
	}

	public void method2() {
		System.out.println("Implementation2 method2");
	}
	public static ServiceFactory factory=new ServiceFactory() {
		
		public Service getService() {
			return new Implementation2();
		}
	};
	
}

class Factories{
	public static void serviceConsumer(ServiceFactory fact){
		Service s=fact.getService();
		s.method1();
		s.method2();
		
	}
	public static void main(String[] args){
		serviceConsumer(Implementation1.factory);
		serviceConsumer(Implementation2.factory);
		
		
		}
}


	
	
