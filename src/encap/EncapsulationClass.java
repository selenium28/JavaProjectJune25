package encap;

public class EncapsulationClass { // data hiding
	
//	How to achieve Encapsulation?
//	Declare the class variable as private.
//	Provide public getter & setter methods to access the values of private variables 
	
	private int empID;  // Data Hiding
	private double salary;
	private String name;

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double money) {
		salary = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String empName) {
		name = name;
	}

	public static void main(String[] args) {
		EncapsulationClass obj = new EncapsulationClass();
		try {
			obj.setEmpID(1209);		
			System.out.println("EMP-ID: " +obj.getEmpID());
		} catch (Exception e) {
			System.out.println("[Error] Get some error while fetching EMP ID");
		}
		
		obj.setName("Dev");
		obj.setSalary(40000);
		
	}

}
