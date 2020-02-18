package hasArelationship;

class Address{
	String city;
	String country;
	
	public Address(String city, String country) {
		this.city = city;
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + "]";
	}
	
	
}

class Student{
	int id;
	String name;
	Address address;// Student has a address// aggregation
	
	public Student(int id, String name, Address address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		
		Address address = new Address("Dhaka","BD");
		
		Student s1 = new Student(1,"Richard",address);
		System.out.println(s1);
	}

}
