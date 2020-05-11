package review07;

public class Dermatologist extends doctor{
	String dermaId;
	//super.name is name as this.name
			//super.chargepatient()is same as this .chargePatient
			//but after overriding they are not the same
	public Dermatologist(String name,int salary,String licenceId,String dermaId) {
		super(name,salary,licenceId);
		
		this.dermaId=dermaId;
		
}
	public void skinTest() {
	System.out.println("Let's apply some skin test");
}
	//Method overriding
	public void chargePatient() {
		System.out.println("Let me charge $200");
	}
}
