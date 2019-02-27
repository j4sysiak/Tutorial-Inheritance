
public class Car extends Machine {
	
	
	
	@Override
	public void start() {
		System.out.println("Car started ...");
	}

	@Override
	public void stop() {
		System.out.println("Car stoped.");
	}

	public void wipeWindShield() {
		System.out.println("Wiping windshield.");
	}
	
	public void showInfo(){
		System.out.println("Car name: " + this.name_public);
		System.out.println("Car name: " + this.name_protected);
	}
 
}
