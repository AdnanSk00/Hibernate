package tka_july8;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class C3_DeleteEmpClient {
	
	public static void main(String[] args) {
		
		Configuration cfgn = new Configuration();
		cfgn.configure();
		cfgn.addAnnotatedClass(C0_Employee.class);
		
		SessionFactory sf = cfgn.buildSessionFactory();
		Session ssn = sf.openSession();
		
		int deleteId = 9;
		// check whether employee exist or not whose id = 2;
		
		C0_Employee emp = ssn.get(C0_Employee.class, deleteId);		// to bring obj/row from db
		if(emp == null) {
			System.out.println(deleteId + " Employee does not exist");
		}
		else {
			
			ssn.delete(emp);		// DML - delete from emp where id = 2; + st.executeUpdate(query);
			System.out.println("Employee deleted from hibernate only");
			
			ssn.beginTransaction().commit();
			System.out.println("Deleted from database successfully");
		}		
		
		
	}
}

// Note ;- Suppose I delete one obj or row using ssn.delete(emp, 2) but I dont run ssn.beginTransaction().commit() so it only deletes from hibernate RAM. We can say that our data or that obj is still present in db.
// If I display ssn.get(emp, 2) so I can see that obj because we didn't delete it from db or mysql workbench.
// If I run ssn.beginTransactiono.commit() so that row is deleted completely from the database.
