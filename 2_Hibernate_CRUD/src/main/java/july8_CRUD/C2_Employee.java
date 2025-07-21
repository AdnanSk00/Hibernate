package july8_CRUD;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class C2_Employee {
	@Id
	int id;
	String name;
	double salary;
	
	public C2_Employee() {
		// TODO Auto-generated constructor stub
	}

	public C2_Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "C2_Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

