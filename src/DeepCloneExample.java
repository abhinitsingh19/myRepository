class Employee implements Cloneable{
	private int id;
	private String name;
	private Department dept;

	public Employee(int id, String name, Department dept) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		
		Employee cloned = (Employee) super.clone();
		cloned.setDept((Department) (cloned.getDept()).clone());
		return cloned;
		
//		return super.clone();
	}

}

class Department implements Cloneable{
	private int id;
	private String name;

	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		
//		Employee cloned = (Employee) super.clone();
//		cloned.setDept(cloned.getDept().cl);
//		
		return super.clone();
	}

}

public class DeepCloneExample 
{
public static void main(String[] args) throws CloneNotSupportedException {
	
	Department dept  = new Department(1, "t3000");
	Employee emp = new Employee(1, "avi", dept  );
	Employee emp1 ;
	emp1 = (Employee) emp.clone();
	
	System.out.println(emp1.getId()+","+emp.getName());
	
	emp1.getDept().setId(2);
	
	emp1.getDept().setName("DAAC");
	
	System.out.println(emp.getDept().getId()+","+emp.getDept().getName());
	
	
}
}
