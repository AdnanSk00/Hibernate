package tka_july8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class C4_UpdateEmpClient1 {
	
	public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();
		cfgn.addAnnotatedClass(C0_Employee.class);
		
//		(3, "Nisha", "HR", 82000 -----);
		double updateSal = 23000;	// id = 3
		int targetId = 3;
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		C0_Employee emp = ssn.get(C0_Employee.class, targetId);		// return obj from db - data of Nisha
		
		emp.setSalary(updateSal);	// updation - 3, Nisha, HR, 91000
		
		ssn.update(emp);		// DML - fire --> 3, Nisha, HR, 91000
//		ssn.save(emp);
		System.out.println("Employee updated in hibernate successfully...");
				
		ssn.beginTransaction().commit();
		System.out.println("Employee updated in database successfully...");
		
		
	}
}
