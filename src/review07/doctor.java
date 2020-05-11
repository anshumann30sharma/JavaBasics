package review07;

public class doctor {
static String hospitalName;
String name;
String licenceId;
int salary;
String address;
//one more variable added
public doctor() {
//	super();
}//
public doctor(String doctorName,  int doctorSalary, String doctorLicenceId) {//constructor to initialise the variables
this.name=doctorName;
this.licenceId=doctorLicenceId;
this.salary=doctorSalary;
System.out.println("This is for Tugba");
}
public doctor(String doctorName,  int doctorSalary, String doctorLicenceId ,String address) {//constructor to initialise the variables
//this(name,salary,licenceId);// calls another constructor
this.address=address;
}
public void checkUp() {
	System.out.println("Doctor "+name+"has ordered blood test.");
}
public void treatPatient(String patientName) {
	//String roomNumber="102";
	System.out.println("Doctor "+name+" gives prescription to "+patientName);
}
public void chargePatient() {
	System.out.println("Let me charge $100.");
}
public void displayInfo() {
	System.out.println("Doctor "+name+" with licenceId "+licenceId+" has a salary "+salary+" works for "+hospitalName);
}
public static void payBills() {
	System.out.println("Everybody pays Bills");
	//non static variables cannot be used
	//System.out.println("Doctor "+name);
}
}
