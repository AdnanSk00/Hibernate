package tka_july8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class C4_UpdateEmpClient2 {
	
	public static void main(String[] args) {
		
		Configuration cfgn = new Configuration().configure().addAnnotatedClass(C0_Employee.class);
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		
		C0_Employee emp = new C0_Employee(1, "Rahul", "Dev", 71000);
//		C0_Employee emp = new C0_Employee(33, "Aarohi", "Manager", 77000);	// updation - 3, Nisha, Acc, 56000
		
		ssn.saveOrUpdate(emp);		// 3, Nisha, ACC, 56000
//		System.out.println("Employee updated in hibernate successfully...");
		ssn.beginTransaction().commit();
		System.out.println("Employee updated in database successfully...");
		
		
	}
}
