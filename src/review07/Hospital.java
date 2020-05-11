package review07;

public class Hospital {

	public static void main(String[] args ) {
		doctor.hospitalName="Hackensack Hospital";//static variable can be assigned
		doctor.payBills();//static method can be called
		//Non static is not allowed because you have to create object
		doctor doctor1;
		doctor1=new  doctor("John Smith",  150000,"12345");
		
		//doc1.name="John Smith";
		//doc1.licenceId="12345";
	//	doc1.salary=150000;
		System.out.println("Doctor's name is John Smith");
		doctor1.displayInfo();
		doctor1.treatPatient("Adam Smith");
		
		doctor doctor2=new doctor("Mehmet Oz",400000,"34567");
		
		doctor2.displayInfo();
		doctor doctor3 =new doctor("Mary James",500000,"68975","123 Seasame st");
		doctor2.displayInfo();
		Dermatologist dermatologist1=new Dermatologist("Tom Hanks",30000,"8910","D123");
		dermatologist1.chargePatient();
		dermatologist1.skinTest();
		

	}
}
