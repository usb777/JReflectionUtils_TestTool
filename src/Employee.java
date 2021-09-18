
public class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Test");
	}
	
	
	private String toStringEmpl()
	{
		return "Employee id = "+this.id+ " Employee name ="+this.name;
	}

}
