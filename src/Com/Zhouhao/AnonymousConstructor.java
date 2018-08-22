package Com.Zhouhao;

public class AnonymousConstructor {
	public static Base getBase(int i){
		return new Base(i){
			{System.out.println("Inside instance initializer");
			
			}
			public void f(){
				System.out.println("In anonymous f()");
			}
		 
		};
	}

	public static void main(String[] args) {
		
		Base base =AnonymousConstructor.getBase(47);
	//	base.f();

	}

}


abstract class Base{
	public Base(int i){
		System.out.println("base constructor.i="+i);
	}
	public abstract void f();
	
}
