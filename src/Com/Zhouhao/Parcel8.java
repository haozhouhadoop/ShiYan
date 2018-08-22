package Com.Zhouhao;

public class Parcel8 {
	public Wrapping wrapping (int x){
		return new Wrapping(x){
			public int value(){
				return super.value*47;
	
		    }
		};
		
	}

	public static void main(String[] args) {
		
		
		Parcel8 p=new Parcel8();
		Wrapping w=p.wrapping(10);
		

	}

}
abstract class Wrapping{
	protected  int value;

	public Wrapping(int w){
		this.value=w;
	}
	
    
	
	
}
