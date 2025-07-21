package tka_july10;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class C22_DisplayAllEmpHQLQuery {
	
public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();
		cfgn.addAnnotatedClass(C0_Employee.class);
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		// Select * from employee;	[All records] --> How?
		
//		Query sqlQueryRes = ssn.createQuery("from C0_Employee"); // HQL > class-name [Select * ... ]
		Query sqlQueryRes = ssn.createQuery("from C0_Employee where role = 'Dev'");
//		Query sqlQueryRes = ssn.createQuery("from C0_Employee where role = 'Dev' AND salary > 60000");
		List <C0_Employee> empList = sqlQueryRes.list();
		
		empList.forEach(System.out::println);
		
//		System.out.println("empList > " + empRawList);
//		System.out.println("empList > " + empRawList.toString());
				
		
	}
}
