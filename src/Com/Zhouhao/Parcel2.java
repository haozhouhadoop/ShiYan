package Com.Zhouhao;

public class Parcel2 {
	
	class Contents{
		private int i=11;
		public int value() {return i;}
		{ System.out.println("contents对象建立完成");
		  System.out.println(this);
		}
	}
	
	class Destination {
		private String label;
		Destination(String whereTo){
			label=whereTo;
            System.out.println("Destination对象建立完成");
           
		}
		{System.out.println(this);}
		
		String readlabel(){return label;}
	}

	public static void main(String[] args) {
	   
		Parcel2  p=new Parcel2();
		p.ship("tasmanisa");
		Parcel2 q=new Parcel2();
	    Parcel2.Contents c=q.contents();
		Parcel2.Destination d=q.to("Borneo");
    
	}
	
	public Destination to(String s){
		System.out.println("Destination对象正在建立");
		return new Destination(s);
	}
	
	public Contents contents(){
		System.out.println("contents对象正在建立");
		return new Contents();
	}
	public void ship(String dest){
		System.out.println(this);
		Contents c=contents();
		Destination d=to(dest);
		System.out.println(d.readlabel());
		
		
	}
	
	

}
