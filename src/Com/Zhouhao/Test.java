package Com.Zhouhao;




public class Test {
	Outer.Inner getInner(Outer o){
		return  o.new Inner();
	}

	public static void main(String[] args) {
		Test t=new Test();
		 Outer outer=new Outer();
		t.getInner(outer);
		
//		Outer.Inner inner=outer.new Inner();//外部看不见

	}

}
class Outer{
	 class Inner{}//默认为是protected，如果不加public
	
		
}