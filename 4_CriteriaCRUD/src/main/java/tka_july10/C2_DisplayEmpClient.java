package tka_july10;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class C2_DisplayEmpClient {
	
public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();
		cfgn.addAnnotatedClass(C0_Employee.class);
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		// Select * From employee where id = 3;
		// Select * from employee;	[All records] --> How?
		C0_Employee e1 = ssn.get(C0_Employee.class, 3);	 	// DQL - SELECT * FROM Employee where id = 3; + st.executeQuery(query);
		System.out.println("e1 > " + e1);					// C0_Employee e1 = ssn.get() --> syso(e1) - to see on console
				
		
	}
}

//Select * from employee;	[All records] --> How?
// Answer - In class C21_DisplayAllEmpSQLQuery.java, C22_DisplayAllEmpHQLQuery.java & C23_DisplayAllEmpCriteria.java
