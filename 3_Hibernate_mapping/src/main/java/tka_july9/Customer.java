package tka_july9;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	int cid;
	String cname;
	String cadd;
	double cmob;
	List<Product> custProductList;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int cid, String cname, String cadd, double cmob) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cadd = cadd;
		this.cmob = cmob;
	}
	public Customer(int cid, String cname, String cadd, double cmob, List<Product> custProductList) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cadd = cadd;
		this.cmob = cmob;
		this.custProductList = custProductList;
	}

	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cadd=" + cadd + ", cmob=" + cmob + ", custProductList="
				+ custProductList + "]";
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCadd() {
		return cadd;
	}

	public void setCadd(String cadd) {
		this.cadd = cadd;
	}

	public double getCmob() {
		return cmob;
	}

	public void setCmob(double cmob) {
		this.cmob = cmob;
	}

	public List<Product> getCustProductList() {
		return custProductList;
	}

	public void setCustProductList(List<Product> custProductList) {
		this.custProductList = custProductList;
	}
	
	
	
	
}
