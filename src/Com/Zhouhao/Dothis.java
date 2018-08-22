package Com.Zhouhao;

public class Dothis {
	void f(){System.out.println("Dothis.f()");}
	public class Inner{
		public Dothis outer(){
			return Dothis.this;  //持有外部类的引用
		}
	}
	public Inner inner(){
		return new Inner();
	}

	public static void main(String[] args) {
		Dothis dt=new Dothis();
		Dothis.Inner dti =dt.inner();
	    System.out.println(dti.outer().toString());

	}

}
