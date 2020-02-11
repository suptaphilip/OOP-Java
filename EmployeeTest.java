
class Employee{
	int eid;
	String name;
	static String ceo;
	
	public void show(){
		System.out.println(eid+" : "+name+" : "+ceo);
	}
}

public class EmployeeTest {
	
	public static void main(String[] args) {
		Employee r1 = new Employee();
		r1.eid = 1;
		r1.name = "Richard";
		Employee.ceo = "Dr. S";
		
		Employee r2 = new Employee();
		r2.eid = 2;
		r2.name = "Nabil";
		Employee.ceo = "Dr. S";
		
		//...................
		Employee.ceo = "Dr. R";
		
		r1.show();
		r2.show();	
	}
}
