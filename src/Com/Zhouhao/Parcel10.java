package Com.Zhouhao;

public class Parcel10 {
	public Destination destination(final String dest,final float price){
		return new Destination() {
			private int cost;
			{
				cost=Math.round(price);
				if(cost>100)
					System.out.println("Over budget!");
				}
			private String label = dest;
			public String readLabel(){  return label;}
		};
	}

	public static void main(String[] args) {
		Parcel10 p=new Parcel10();
		Destination d=p.destination("tamania", 101.395F);// 匿名内部类需要实现外部接口或者类

	}

}
