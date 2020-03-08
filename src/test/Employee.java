package test;

public class Employee {

	
	private  String firstName;
	private String lastName;
	
	public Employee(String fName, String lName)
	{
		firstName = fName;
		lastName = lName;
		
	}
	
	public  boolean equals(Object obj)
	{
		if (obj instanceof Employee)
		{
			Employee emp = (Employee)obj;
			if(emp.firstName.equalsIgnoreCase(this.firstName) && emp.lastName.equalsIgnoreCase(this.lastName))
			{
				return true;
			}
			
		}
		return false;
		
	}
	
}
