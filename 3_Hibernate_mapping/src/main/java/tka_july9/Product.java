package tka_july9;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	int pid;
	String pname;
	double pcost;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int pid, String pname, double pcost) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pcost = pcost;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public double getPcost() {
		return pcost;
	}

	public void setPcost(double pcost) {
		this.pcost = pcost;
	}

	@Override
	public String toString() {
		return "product [pid=" + pid + ", pname=" + pname + ", pcost=" + pcost + "]";
	}
	
	
}
