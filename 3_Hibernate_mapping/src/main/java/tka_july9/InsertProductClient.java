package tka_july9;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class InsertProductClient {
	public static void main(String[] args) {
		
		Product p1 = new Product(1, "GulabJamoon", 20.0);
		Product p2 = new Product(2, "Kachori", 25.00);
		Product p3 = new Product(3, "Kheer", 70.0);
		Product p4 = new Product(4, "Poha", 15.0);
		Product p5 = new Product(5, "Samosa", 25.0);
		Product p6 = new Product(6, "Chai", 10.0);
		
		List<Product> productList = new ArrayList<>();
		
		productList.add(p1);
		productList.add(p2);
		productList.add(p3);
		productList.add(p4);
		productList.add(p5);
		productList.add(p6);
		
		for(Product p : productList) {
			insertDB(p);
		}
	}
	
	public static void insertDB(Product p) {
		SessionFactory sf = MyHBConf.getMyHBConf();
		Session ssn = sf.openSession();
		
		ssn.save(p);
		ssn.beginTransaction().commit();
		System.out.println(p.pname + " inserted successfully...");
	}
}
