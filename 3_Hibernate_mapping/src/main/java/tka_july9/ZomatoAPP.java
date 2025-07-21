package tka_july9;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ZomatoAPP {
	public static void main(String[] args) {
			
		Customer c1 = new Customer(1, "Farhan", "Pune", 242424242);
		List<Product> productList1 = new ArrayList<>();
		Product p1 = new Product(1, "GulabJamoon", 20.0);		// Menu
		Product p2 = new Product(2, "Kachori", 25.00);
		Product p3 = new Product(3, "Kheer", 70.0);
		Product p4 = new Product(4, "Poha", 15.0);
		Product p5 = new Product(5, "Samosa", 25.0);
		Product p6 = new Product(6, "Chai", 10.0);
		
		productList1.add(p1);
		productList1.add(p3);
		productList1.add(p6);
		
		c1.setCustProductList(productList1);
		
		Configuration cfg = new Configuration().configure().addAnnotatedClass(Customer.class);
		SessionFactory sf = cfg.buildSessionFactory();
		Session ssn = sf.openSession();
		
		ssn.save(c1);
		ssn.beginTransaction().commit();
		System.out.println(c1.cname + " inserted successfully...");
		
		
		Customer c2 = new Customer(2, "Saeed", "Mumbai", 989898899);
		
	}
	
	
	
}
