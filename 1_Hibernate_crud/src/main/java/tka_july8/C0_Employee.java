package tka_july8;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class C0_Employee {		// java Entity --> Hibernate Entity class
	
	@Id
	int eid;
	String name;
	String role;
	double salary;
	
	public C0_Employee() {
		// TODO Auto-generated constructor stub
	}

	public C0_Employee(int eid, String name, String role, double salary) {
		super();
		this.eid = eid;
		this.name = name;
		this.role = role;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", role=" + role + ", salary=" + salary + "]";
	}
	
	
}
