package XiangShangZhuanXing;

public class A {
	private class Inner implements B{
		public void fun(){
			System.out.println("haole");
		}
	}
    B getB(){
    	return new Inner();
    }

	public static void main(String[] args) {
		A p=new A();
		Inner i=(Inner)p.getB();

	}

}
