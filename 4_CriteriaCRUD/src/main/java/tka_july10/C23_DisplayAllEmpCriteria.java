package tka_july10;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

public class C23_DisplayAllEmpCriteria {
	
public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();
		cfgn.addAnnotatedClass(C0_Employee.class);
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		// Select * from employee;	[All records] --> How?
		
		// All rows [6]
		Criteria crt = ssn.createCriteria(C0_Employee.class);	// class-name	
		
		// Restriction -> filter the rows data - where, order by, like
//		crt.add(Restrictions.eq("role", "Dev"));	// == where, like clause
//		crt.add(Restrictions.gt("salary", 80000.0));
//		crt.add(Restrictions.like("name", "A%"));
		
//		crt.addOrder(Order.desc("salary"));			// order by - desc
//		crt.addOrder(Order.asc("salary"));
		
		
		// select * from employee [where, order by, like];
		
		// * col / result function(max, avg) left table name --> Projection
		// Select max(salary) from c0_employee;				 --> projection
		
		List <C0_Employee> empList = crt.list();
		
		empList.forEach(System.out::println);
		
//		System.out.println("empList > " + empRawList);
//		System.out.println("empList > " + empRawList.toString());
				
		
	}
}
