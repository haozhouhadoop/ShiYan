package Com.Zhouhao;





public class Parce17 {
	public Contents contents(){
		return new Contents(){
			private int i=11;
			public int value(){return i;
			
			}
		};
	}//匿名内部内，向上转型

	public static void main(String[] args) {
		Parce17 p=new Parce17();
		Contents c=p.contents();

	}

}
interface Contents{
	
}
