package inheritance;

class Employee {
	private String name;
	private double salary;
	
	public Employee(){
		
	}
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
}

class Programmer extends Employee{
	
	private double bonous;
	
	public Programmer(){
		super();
	}
			
	public Programmer(String name, double salary) {
		super(name, salary);
		this.bonous=bonous;
	}
	public double getBonous() {
		return bonous;
	}
	public void setBonous(double bonous) {
		this.bonous = bonous;
	}

	@Override
	public String toString() {
		return "Programmer [bonous=" + bonous + ", getName()=" + getName() + ", getSalary()=" + getSalary() + "]";
	}

	

	
}

public class InheritanceTest{
	public static void main(String[] args){
		
		Programmer p = new Programmer();
		p.setName("H");
		p.setSalary(5000);
		p.setBonous(200);
	System.out.println(p);
		
	}
}

