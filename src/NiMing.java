
public class NiMing {
	class MyContents implements Contents{
		private int i= 11;
		public int value() {return  i;}
		
	}
	public Contents contents(){return new MyContents();}
	

	public static void main(String[] args) {

		NiMing n=new NiMing();
		Contents c=n.contents();
	}

}

interface Contents{
}//向上转型