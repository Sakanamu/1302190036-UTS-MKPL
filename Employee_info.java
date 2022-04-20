package lib;



public class Employee_info  {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
        public Employee_info(String employeeId, String firstName, String lastName, String idNumber, String address){
            this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
		this.address = address;
        }
}