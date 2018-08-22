package Com.Zhouhao;



public class Parcel9 {
	public Destination destination(final String dest){
		return new Destination(){
			private String lable =dest;
			public String readLabel(){
				return lable;
			}
		};
	}

	public static void main(String[] args) {
		Parcel9 p=new Parcel9();
		Destination d=p.destination("Tamanisa");

	}

}
interface Destination{
	public String readLabel();
	
}
