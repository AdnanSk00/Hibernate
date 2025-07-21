package tka_july10;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

public class C21_DisplayAllEmpSQLQuery {
	
public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();
		cfgn.addAnnotatedClass(C0_Employee.class);
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		// Select * from employee;	[All records] --> How?
		
		
//		NativeQuery sqlQuery = ssn.createSQLQuery("Select * from c0_employee");		// sql > table-name
//		Query sqlQueryRes = ssn.createSQLQuery("Select * from c0_employee");		// DD
		Query sqlQueryRes = ssn.createSQLQuery("Select * from c0_employee where role = 'Dev'");
		List <Object[][]> empRawList = sqlQueryRes.list();		
		
		for(Object row[] : empRawList) {
			for(Object column : row) {
				System.out.print(column + " ");				
			} System.out.println();
		}
		
//		System.out.println("empList > " + empRawList);
//		System.out.println("empList > " + empRawList.toString());
				
		
	}
}

