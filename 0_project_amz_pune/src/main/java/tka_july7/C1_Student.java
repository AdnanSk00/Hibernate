package tka_july7;

import javax.persistence.Entity;		// JPA
import javax.persistence.Id;

@Entity
public class C1_Student {		// @Table(name = "student")
	
	@Id
	int id;					// primary key
	String name;
	float per;
	 
	public C1_Student() {
		// TODO Auto-generated constructor stub
	}

	public C1_Student(int id, String name, float per) {
		super();
		this.id = id;
		this.name = name;
		this.per = per;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", per=" + per + "]";
	}
	
	
}
