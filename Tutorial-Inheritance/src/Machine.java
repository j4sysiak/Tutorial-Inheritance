
public class Machine {
	
	private String name_private = "Machine Type 1 (private)";
	protected String name_protected = "Machine Type 1 (protected)";
			String name_public = "Machine Type 1 (public)";

	public void start(){
		System.out.println("Machine started ...");
	}
	
	public void stop(){
		System.out.println("Machine stoped.");
	}
}
