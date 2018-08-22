package Com.Zhouhao;

public class Parcel3 {
	class contents{
		private int i=11;
		public  int value(){
			return i;
		}
	}
	class Destination{
		private String label;
		public Destination(String whereTo) {
			label= whereTo;
		}
		String readLabel(){return label;}
	}

	

	public static void main(String[] args) {
		Parcel3 p=new Parcel3();//在拥有外部类对象之前不能创建
		Parcel3.contents c=p.new contents();//内部类,因为内部类对象会连到外部类上
		Parcel3.Destination d=p.new Destination("Tamaisa");
		

	}

}
