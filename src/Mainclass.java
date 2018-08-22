
public class Mainclass {

	public static void main(String[] args) {
		Annimal annimal= new Annimal();
		Mainclass.watchDoor(new Annimal(){
			String whisper(){
				return "旺旺";
			}
		});
		Mainclass.flyGepassBook(new Flyable(){
			public void fly(){
				System.out.println("飞");
			}
		});
		Mainclass.fishSwimming(new Swimable() {
			

			public void swim() {
				System.out.println("游");
				
			}
		});
				
		
       
	}

	private static void fishSwimming(Swimable swimable) {
		// TODO Auto-generated method stub
		
	}

	private static void flyGepassBook(Flyable flyable) {
		// TODO Auto-generated method stub
		
	}

	private static void watchDoor(Annimal annimal) {
		// TODO Auto-generated method stub
		
	}

}
class Annimal{
	String name;
	String whisper(){
		return null;
	}
}



class Dog extends Annimal{
	String whisper(){
		return "旺旺";
	}
}

interface Flyable{
	public void fly();
	
}
 
interface Swimable{
	 public void swim();
	 
 }
 

