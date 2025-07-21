package tka_july8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class C1_InsertEmpClient {
	
	public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();		// link - hibernet.cfg.xml
		cfgn.addAnnotatedClass(C0_Employee.class);
		
//		C0_Employee e1 = new C0_Employee(1, "Rahul", "Dev", 77000);
		C0_Employee e1 = new C0_Employee(3, "Nisha", "HR", 82000);
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		ssn.save(e1);
		System.out.println("Employee saved in hibernate only");
				
		ssn.beginTransaction().commit();
		System.out.println("Employee saved in database only");
		
		
	}
}
